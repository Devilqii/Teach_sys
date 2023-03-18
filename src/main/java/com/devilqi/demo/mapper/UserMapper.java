package com.devilqi.demo.mapper;

import com.devilqi.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper  //Repository
public interface UserMapper {

    @Select("SELECT * FROM sys_user")
    List<User> findAll();

    @Insert("INSERT into sys_user(username,password,nickname,email,phone,address) VALUES " +
            "(#{username},#{password},#{nickname},#{email},#{phone},#{address})")
    int insert(User user);

//    @Update("update sys_user set username=#{username},password=#{password},nickname=#{nickname},email=#{email}," +
//            "phone=#{phone},address=#{address} where id = #{id}")
//动静态选一个
    int update(User user);

    @Delete("delete from sys_user where id = #{id}")
    Integer deleteById(@Param("id") Integer id);

    @Select("select * from sys_user limit #{pageNum},#{pageSize}")
    // List<User> selectPage(Integer pageNum ,Integer pageSize);
    List<User> selectPage(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    @Select("select count(*) from sys_user")
    Integer selectTotal();
}
