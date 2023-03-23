package com.devilqi.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
@TableName(value = "sys_user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    @JsonIgnore  //忽略某个字段不展示给前端
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;

    @TableField(value = "avatar_url")  // 指定数据库的字段名称
    private String avatar;
}
