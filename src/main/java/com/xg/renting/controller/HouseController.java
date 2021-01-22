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

}
