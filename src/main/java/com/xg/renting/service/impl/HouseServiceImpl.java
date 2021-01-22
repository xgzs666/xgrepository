package com.xg.renting.service.impl;

import com.xg.renting.common.Response;
import com.xg.renting.dao.HouseMapper;
import com.xg.renting.enity.House;
import com.xg.renting.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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
    public Response deleteHouse(int house_id,int merchant_id) {
       int result = houseMapper.deleteHouse(house_id,merchant_id);
       if (result != 1 ) {
                return Response.createByErrorMessage("删除失败");
       }
       return Response.createBySuccessMessage("删除成功");
    }

    @Override
    public Response updateHouse(House house) {
        int result = houseMapper.updateHouse(house);
        if (result != 1 ) {
            return Response.createByErrorMessage("修改失败");
        }
        return Response.createBySuccessMessage("修改成功");
    }

    @Override
    public Response selectHouseByPlace(String house_place) {
        List selectList = houseMapper.selectHouseByPlace(house_place);
        if (selectList == null) {
            return Response.createByErrorMessage("没有"+ house_place +"房源");
        }
        return Response.createBySuccess("查询成功",selectList);
    }
}
