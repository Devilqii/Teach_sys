package com.devilqi.demo.controller;

import com.devilqi.demo.entity.User;
import com.devilqi.demo.mapper.UserMapper;
import com.devilqi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    // 新增和修改
    @PostMapping
    public Integer save(@RequestBody User user){ //RequsetBody可以把前台的josn对象转换为后台java对象  save；新增+更新
        //新增或更新
        return userService.save(user);
    }

    // 查询所有数据
    @GetMapping
    public List<User> index(){
        return userMapper.findAll();

    }

    //删除数据
    @DeleteMapping("/{id}")  //id为同一个参数 不能改变
    public Integer delete(@PathVariable Integer id){
        return userMapper.deleteById(id);
    }
}
