package com.xg.renting.service.impl;

import com.xg.renting.common.Response;
import com.xg.renting.dao.HouseMapper;
import com.xg.renting.enity.House;
import com.xg.renting.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;
    @Override
    public Response insertHouse(House house) {
       int result = houseMapper.insertHouse(house);
       if (result != 1) {
           return Response.createByErrorMessage("添加失败");
       }
       return Response.createBySuccessMessage("添加成功");
    }

    @Override
    public Response deleteHouse(House house) {
        return null;
    }

    @Override
    public Response updateHouse(House house) {
        return null;
    }

    @Override
    public Response selectHouseByPlace(String house_place) {
        return null;
    }
}
