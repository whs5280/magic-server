package com.magic.module.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.magic.module.order.entity.DispatchOrder;
import com.magic.module.order.entity.vo.DispatchOrderVo;

import java.util.List;

public interface DispatchOrderService extends IService<DispatchOrder> {
    // 订单列表
    List<DispatchOrderVo> orderList(Integer userId);

    // 订单详情
    DispatchOrderVo orderDetail(Integer orderId);

    // 抢单
    Boolean receivedOrder(Integer userId, Integer orderId);
}
