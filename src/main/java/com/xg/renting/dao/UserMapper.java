package com.xg.renting.dao;

import com.xg.renting.enity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (user_name, user_password, user_role) VALUES (#{user_name}, #{user_password}, #{user_role} )")
    int register(User user);

    @Select("SELECT user_name FROM user WHERE user_name = #{user_name}")
    String selectNameByUser(String user_name);

    @Select("SELECT * FROM user WHERE user_name = #{user_name} AND user_password = #{user_password}")
    User login(User user);
}
