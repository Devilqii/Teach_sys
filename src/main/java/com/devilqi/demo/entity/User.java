package com.devilqi.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
@TableName(value = "bs_data")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String filename;
    private String termtime;
    private Integer courseno;
    private String coursename;
    private String method;
    private String stumajor;
//@JsonIgnore  //忽略某个字段不展示给前端
//    @TableField(value = "avatar_url")  // 指定数据库的字段名称
//    private String avatar;
}
