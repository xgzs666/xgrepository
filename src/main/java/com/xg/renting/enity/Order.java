package com.xg.renting.enity;

import lombok.Data;

@Data
public class Order {
    //订单id、订单名称、租户id、商户id、订单价格、入住时间、租期、订单状态（0 待支付、1已支付）
    private int order_id;
    private String order_name;
    private int tenant_id;
    private int merchant_id;
    private float order_price;
    private String in_time;
    private int lease_term;
    private int order_status;
}
