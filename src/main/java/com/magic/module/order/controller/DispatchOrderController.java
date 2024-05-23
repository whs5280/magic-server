package com.magic.module.order.controller;

import com.magic.common.response.ResponseResult;
import com.magic.module.order.entity.vo.DispatchOrderVo;
import com.magic.module.order.service.DispatchOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RequestMapping("/api/order")
@RestController
public class DispatchOrderController {
    private final DispatchOrderService orderService;

    public DispatchOrderController(DispatchOrderService orderService)
    {
        this.orderService = orderService;
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
}
