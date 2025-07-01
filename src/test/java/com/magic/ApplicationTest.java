package com.magic;

import com.magic.module.order.entity.DispatchOrder;
import com.magic.module.order.entity.vo.DispatchOrderVo;
import com.magic.module.order.service.DispatchOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.Random;

@SpringBootTest
@Component
public class ApplicationTest {

    @Autowired
    public DispatchOrderService dispatchOrderService;

    @Test
    public void insertOne() {
        DispatchOrder order = new DispatchOrder();

        Random random = new Random();
        int userId = random.nextInt(10001) + 1;
        order.setUserId(userId);

        dispatchOrderService.addOrder(order);
    }

    @Test
    public void insertBatch() {
        for (int i = 0; i < 10; i++) {
            insertOne();
        }
    }

    @Test
    public void selectByOrderId() {
        DispatchOrderVo orderVo = dispatchOrderService.orderDetail(1375711233);
        System.out.println(orderVo);
    }
}
