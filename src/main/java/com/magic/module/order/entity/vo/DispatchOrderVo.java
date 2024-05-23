package com.magic.module.order.entity.vo;

import lombok.Data;

import java.util.Date;

@Data
public class DispatchOrderVo {
    private Integer orderId;

    private String orderNo;

    private Integer businessTypeId;

    private String businessTypeName;

    private String cityadcodes;

    private String citynames;

    private String suitabletime;

    private Double floorarea;

    private Integer type;

    private Double budget;

    private Double totalAmount;

    private String orderStatus;

    private String orderStatusName;

    private Date createdAt;

    private String stylePreference;

    private String demandSummarize;

    private Integer version;

    private Integer contactType;

    private String phone;

    private Integer isActiveCustomer;

    private String encrypted;

    private Integer ableId;
}
