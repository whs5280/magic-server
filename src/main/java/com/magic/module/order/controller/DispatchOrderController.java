package com.magic.module.order.controller;

import com.magic.common.component.MQDelayMessageSender;
import com.magic.common.response.ResponseResult;
import com.magic.common.util.JsonUtil;
import com.magic.module.order.entity.DispatchOrder;
import com.magic.module.order.entity.vo.DispatchOrderVo;
import com.magic.module.order.service.DispatchOrderService;
import org.springframework.amqp.core.CustomExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RequestMapping("/api/order")
@RestController
public class DispatchOrderController {
    private final DispatchOrderService orderService;
    private final MQDelayMessageSender mqSender;
    private final CustomExchange delayedExchange;

    public DispatchOrderController(DispatchOrderService orderService, MQDelayMessageSender mqSender, @Qualifier("delayedExchange") CustomExchange delayedExchange)
    {
        this.orderService = orderService;
        this.mqSender = mqSender;
        this.delayedExchange = delayedExchange;
    }

    @GetMapping("/add")
    public ResponseEntity<?> addOrder(@RequestParam Integer userId)
    {
        if (userId.equals(0)) {
            return ResponseEntity.ok(ResponseResult.fail("param userId error"));
        }

        DispatchOrder order = new DispatchOrder();
        order.setUserId(userId);

        if (orderService.addOrder(order)) {
            return ResponseEntity.ok(ResponseResult.success(order));
        } else {
            return ResponseEntity.ok(ResponseResult.fail("add order fail"));
        }
    }

    @GetMapping("/index")
    public ResponseEntity<?> orderList(@RequestParam Integer userId)
    {
        if (userId.equals(0)) {
            return ResponseEntity.ok(ResponseResult.fail("param userId error"));
        }
        List<DispatchOrderVo> list = orderService.orderList(userId);
        return ResponseEntity.ok(ResponseResult.success(list));
    }

    @GetMapping("/detail")
    public ResponseEntity<?> orderDetail(@RequestParam Integer orderId)
    {
        if (orderId.equals(0)) {
            return ResponseEntity.ok(ResponseResult.fail("param orderId error"));
        }
        DispatchOrderVo orderVo = orderService.orderDetail(orderId);
        return ResponseEntity.ok(ResponseResult.success(orderVo));
    }

    @PostMapping("/rush")
    public ResponseEntity<?> RushOrder(Integer userId, Integer orderId)
    {
        DispatchOrderVo orderVo = orderService.orderDetail(orderId);
        if (Objects.isNull(orderVo)) {
            return ResponseEntity.ok(ResponseResult.fail("order was not find"));
        }
        if (orderService.receivedOrder(userId, orderId)) {
            return ResponseEntity.ok(ResponseResult.success(orderVo));
        } else {
            return ResponseEntity.ok(ResponseResult.fail("rush order fail"));
        }
    }

    @GetMapping("/delayQueue")
    public ResponseEntity<?> delayQueue(Integer orderId)
    {
        DispatchOrderVo orderVo = orderService.orderDetail(orderId);
        if (Objects.isNull(orderVo)) {
            return ResponseEntity.ok(ResponseResult.fail("order was not find"));
        } else {
            // 延迟队列
            HashMap<String, String> orderMessage = new HashMap<>();
            orderMessage.put("order_id", String.valueOf(orderId));
            orderMessage.put("event", "close");

            System.out.println(delayedExchange.getName());
            mqSender.sendDelayedMessage(delayedExchange.getName(), "message", JsonUtil.toJson(orderMessage), 30);
            return ResponseEntity.ok(ResponseResult.success(orderMessage));
        }
    }
}
