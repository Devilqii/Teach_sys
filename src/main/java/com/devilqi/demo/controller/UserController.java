package com.devilqi.demo.controller;

import com.devilqi.demo.entity.User;
import com.devilqi.demo.mapper.UserMapper;
import com.devilqi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<User> findAll(){
        List<User> all = userMapper.findAll();
        return all;
    }

    //删除数据
    @DeleteMapping("/{id}")  //id为同一个参数 不能改变
    public Integer delete(@PathVariable Integer id){
        return userMapper.deleteById(id);
    }

    //分页查询
    //@RequestParam接收  ?pageNum=1&pageSize=10
    // SELECT * FROM sys_user limit x,pageSize;
    // x = (pageNum - 1) * pageSize [limit的第一个参数]
    @GetMapping("/page") //接口路径：/user/page
    public Map<String, Object> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        pageNum = (pageNum - 1) * pageSize;
        List<User> data = userMapper.selectPage(pageNum ,pageSize);
        Integer total = userMapper.selectTotal();
        Map<String, Object> res = new HashMap<>();
        res.put("data", data);
        res.put("total", total);
        return res;
    }
}
