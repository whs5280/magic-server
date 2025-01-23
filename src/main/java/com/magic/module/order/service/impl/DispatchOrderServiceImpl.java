package com.magic.module.order.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.magic.common.util.AesUtil;
import com.magic.module.order.constant.DispatchOrderEnum;
import com.magic.module.order.entity.DispatchOrder;
import com.magic.module.order.entity.vo.DispatchOrderVo;
import com.magic.module.order.mapper.DispatchOrderMapper;
import com.magic.module.order.service.DispatchOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchOrderServiceImpl extends ServiceImpl<DispatchOrderMapper, DispatchOrder> implements DispatchOrderService {
    @Override
    public Boolean addOrder(DispatchOrder order) {
        return super.save(order);
    }

    @Override
    public List<DispatchOrderVo> orderList(Integer userId) {
        QueryWrapper<DispatchOrder> queryWrapper = new QueryWrapper<DispatchOrder>()
                .eq("user_id", userId).eq("is_active_customer", 0)
                .orderByDesc("order_id");
        List<DispatchOrder> list = this.baseMapper.selectList(queryWrapper);

        // 处理数据结构
        List<DispatchOrderVo> voList = BeanUtil.copyToList(list, DispatchOrderVo.class);
        for (DispatchOrderVo order : voList) {
            order.setBusinessTypeName(DispatchOrderEnum.getBusinessNameByType(order.getBusinessTypeId()));
            order.setOrderStatusName(DispatchOrderEnum.getOrderStatusNameType(order.getOrderStatus()));
            order.setPhone(AesUtil.decrypt(order.getEncrypted()));
        }

        return voList;
    }

    @Override
    public DispatchOrderVo orderDetail(Integer orderId) {
        QueryWrapper<DispatchOrder> queryWrapper = new QueryWrapper<DispatchOrder>()
                .eq("order_id", orderId);
        DispatchOrder order = this.baseMapper.selectOne(queryWrapper);

        DispatchOrderVo vo = BeanUtil.copyProperties(order, DispatchOrderVo.class);
        vo.setPhone(AesUtil.decrypt(vo.getEncrypted()));
        return vo;
    }

    @Override
    public Boolean receivedOrder(Integer userId, Integer orderId) {
        QueryWrapper<DispatchOrder> queryWrapper = new QueryWrapper<DispatchOrder>()
                .eq("order_id", orderId);
        DispatchOrder order = this.baseMapper.selectOne(queryWrapper);
        if (order == null) {
            return false;
        } else {
            if (order.getUserId().equals(userId)) {
                order.setOrderStatus(DispatchOrderEnum.ORDER_STATUS_RECEIVED.getOrderStatus());
                order.setReceivedTime(new java.util.Date());
                this.baseMapper.updateById(order);
                return true;
            } else {
                return false;
            }
        }
    }
}
