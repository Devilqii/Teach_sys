package com.devilqi.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.devilqi.demo.entity.User;
import com.devilqi.demo.mapper.UserMapper;
import com.devilqi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    // 新增和修改
    @PostMapping
    public boolean save(@RequestBody User user){ //RequsetBody可以把前台的josn对象转换为后台java对象  save；新增+更新
        //新增或更新
        return userService.saveUser(user);
    }

    // 查询所有数据
    @GetMapping
    public List<User> findAll(){
        return userService.list();
    }

    //删除数据
    @DeleteMapping("/{id}")  //id为同一个参数 不能改变
    public boolean delete(@PathVariable Integer id){
        return userService.removeById(id);
    }

    //批量删除
    @PostMapping("/del/batch")  //id为同一个参数 不能改变
    public boolean deleteBatch(@RequestBody List<Integer> ids){
        return userService.removeByIds(ids);
    }

    //分页查询
    //@RequestParam接收  ?pageNum=1&pageSize=10
    // SELECT * FROM sys_user limit x,pageSize;
    // x = (pageNum - 1) * pageSize [limit的第一个参数]
//    @GetMapping("/page") //接口路径：/user/page
//    public Map<String, Object> findPage(@RequestParam Integer pageNum,
//                                        @RequestParam Integer pageSize,
//                                        @RequestParam String username) {
//        pageNum = (pageNum - 1) * pageSize;
//        username = "%" + username + "%";
//        List<User> data = userMapper.selectPage(pageNum, pageSize, username);
//        Integer total = userMapper.selectTotal(username);
//        Map<String, Object> res = new HashMap<>();
//        res.put("data", data);
//        res.put("total", total);
//        return res;
//    }

    // 分页查询：mybatis-plus方式
    @GetMapping("/page") //接口路径：/user/page
    public IPage<User> findPage(@RequestParam Integer pageNum,
                                @RequestParam Integer pageSize,
                                @RequestParam (defaultValue = "") String filename,
                                @RequestParam (defaultValue = "") String courseno,
                                @RequestParam (defaultValue = "") String coursename) {
        IPage<User> page = new Page<>(pageNum, pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (!"".equals(filename)) {
            queryWrapper.like("filename", filename);
        }
        if (!"".equals(courseno)) {
            queryWrapper.like("courseno", courseno);
        }
        if (!"".equals(coursename)) {
            queryWrapper.like("coursename", coursename);
        }
        queryWrapper.orderByDesc("id");
        return userService.page(page, queryWrapper);
    }
}
