package com.magic.module.order.constant;

import java.util.Objects;

public enum DispatchOrderEnum {
    ORDER_STATUS_PENDING("pending", "派单中"),
    ORDER_STATUS_RECEIVED("received", "已接单"),
    ORDER_STATUS_DISABLED("disabled", "已取消"),
    ORDER_STATUS_CHECKED("checked", "已核销"),
    ORDER_STATUS_TIMEOUT("timeout", "已超时"),

    FULL_PACKAGE(1, "全案整装"),
    DESIGN_AND_CONSTRUCTION(2, "设计+施工"),
    PURE_DESIGN(3, "纯设计"),
    SOFT_FURNISHING_DESIGN(4, "软装设计"),
    PARTIAL_RENOVATION(5, "局部改造");
    ;

    /**
     * 订单状态
     */
    private String orderStatus;
    private String orderStatusName;

    DispatchOrderEnum(String orderStatus, String orderStatusName) {
        this.orderStatus = orderStatus;
        this.orderStatusName = orderStatusName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public static String getOrderStatusNameType(String orderStatus) {
        for (DispatchOrderEnum orderStatusEnum : DispatchOrderEnum.values()) {
            if (Objects.equals(orderStatusEnum.getOrderStatus(), orderStatus)) {
                return orderStatusEnum.getOrderStatusName();
            }
        }
        return null;
    }

    /**
     * 业务类型
     */
    private Integer business;
    private String businessName;

    DispatchOrderEnum(Integer business, String businessName) {
        this.business = business;
        this.businessName = businessName;
    }

    public Integer getBusiness() {
        return business;
    }

    public String getBusinessName() {
        return businessName;
    }

    public static String getBusinessNameByType(Integer business) {
        for (DispatchOrderEnum businessEnum : DispatchOrderEnum.values()) {
            if (Objects.equals(businessEnum.getBusiness(), business)) {
                return businessEnum.getBusinessName();
            }
        }
        return null;
    }
}
