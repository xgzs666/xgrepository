package com.xg.renting.dao;

import com.xg.renting.common.Response;
import com.xg.renting.enity.House;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HouseMapper {
    @Insert("INSERT INTO house(house_title,house_information,house_price,merchant_id,house_lease,house_place)VALUES(#{house_title},#{house_information},#{house_price},#{merchant_id},#{house_lease" +
            "},#{house_place})")
    int insertHouse(House house);

    @Delete("DELETE FROM house WHERE house_id = #{house_id} AND merchant_id = #{merchant_id}")
    int deleteHouse(int house_id,int merchant_id);

    @Update("UPDATE house SET house_title=#{house_title},house_information=#{house_information},house_price=#{house_price} WHERE house_id=#{house_id} AND merchant_id = #{merchant_id}")
    int updateHouse(House house);

    @Select("SELECT * FROM house WHERE house_place=#{house_place}")
    List selectHouseByPlace(String house_place);
}
