package com.xg.renting.enity;

import lombok.Data;

@Data
public class House {

    private int house_id;
    private String house_title;          //标题，房型等
    private String house_information;   //具体信息：地址，房子介绍
    private int merchant_id;
    private float house_price;
    private int house_lease;
}
