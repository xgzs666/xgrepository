package com.xg.renting.controller;

import com.xg.renting.common.Response;
import com.xg.renting.enity.House;
import com.xg.renting.enity.User;
import com.xg.renting.service.HouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "House",description = "房源")
@RestController
@RequestMapping("/house/")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @ApiOperation(value = "添加房源")
    @PostMapping(value = "insertHouse")
    public Response insertHouse(@RequestBody House house) {
        return  houseService.insertHouse(house);
    }

    @ApiOperation(value = "删除房源")
    @PostMapping(value = "deleteHouse")
    public Response deleteHouse(@RequestBody int house_id,int merchant_id) {
        return  houseService.deleteHouse(house_id,merchant_id);
    }

    @ApiOperation(value = "修改房源")
    @PostMapping(value = "updateHouse")
    public Response updateHouse(@RequestBody House house) {
        return  houseService.updateHouse(house);
    }

    @ApiOperation(value = "查询目的地房源")
    @PostMapping(value = "selectHouse")
    public Response selectHouseByPlace(@RequestBody String place) {
        return  houseService.selectHouseByPlace(place);
    }
}
