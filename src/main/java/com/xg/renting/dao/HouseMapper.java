package com.xg.renting.dao;

import com.xg.renting.common.Response;
import com.xg.renting.enity.House;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HouseMapper {
    @Insert("INSERT INTO house(house_title,house_information,house_price,merchant_id,house_lease)VALUES(#{house_title},#{house_information},#{house_price},#{merchant_id},#{house_lease" +
            "})")
    int insertHouse(House house);

    @Delete("DELETE FROM house WHERE house_id = #{house_id}")
    int deleteHouse(House house);

    @Update("UPDATE house SET house_title=#{house_title},house_information=#{house_information},house_price=#{house_price} WHERE house_id=#{house_id}")
    int updateHouse(House house);

    @Select("SELECT * FROM house WHERE house_place=#{house_place} ")
    Response selectHouseByPlace(String house_place);
}
