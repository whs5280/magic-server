package com.magic.module.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName(value = "b_dispatch_order")
public class DispatchOrder implements Serializable {
    @TableId(value = "order_id", type = IdType.AUTO)

    private Integer orderId;

    private String orderNo;

    private Integer userId;

    private Integer businessTypeId;

    private String cityadcodes;

    private String citynames;

    private String suitabletime;

    private Double floorarea;

    private Integer type;

    private Double budget;

    private String space;

    private Double totalAmount;

    private String orderStatus;

    private Integer designerId;

    private Integer closed;

    private Date expiredTime;

    private String cancelReason;

    private String reasonDescription;

    private Integer isAfresh;

    private Integer afreshOrderId;

    private Integer checkId;

    private Date closedTime;

    private Date receivedTime;

    private Date checkedTime;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private String familymember;

    private String homeName;

    private String stylePreference;

    private String demandSummarize;

    private Integer version;

    private Integer contactType;

    private String phone;

    private Integer isActiveCustomer;

    private String encrypted;

    private Integer ableId;

    private Integer entrance;
}
