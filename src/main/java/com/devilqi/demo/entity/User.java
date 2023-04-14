package com.devilqi.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

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
    private String classno;
    private String lecturer;
    private String counselor;
    private Integer totalhours;
    private Integer overhours;
    private Integer thishours;
    private Integer weeks;
    private Integer classroomhours;
    private Integer exercisehours;
    private Integer experimentalhours;
    private Integer computerhours;
    private Integer mobilehours;
    private Integer other;
    private Date date;
    private String one;
    private String two;
    private String three;
    private String four;
    private String five;
    private String six;
    private String seven;
    private String lecturersignature;
    private String directorsignature;



//@JsonIgnore  //忽略某个字段不展示给前端
//    @TableField(value = "avatar_url")  // 指定数据库的字段名称
//    private String avatar;
}
