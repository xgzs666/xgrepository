package com.xg.renting.service;

import com.xg.renting.common.Response;
import com.xg.renting.enity.House;

public interface HouseService {
    Response insertHouse(House house);
    Response deleteHouse(House house);
    Response updateHouse(House house);
    Response selectHouseByPlace(String house_place);


}
