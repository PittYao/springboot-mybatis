package com.mybatis.mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.mybatis.mybatis.domain.User;
import com.mybatis.mybatis.service.ClassRoomService;
import com.mybatis.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping("/test/{id}")
    public  String test(@PathVariable(value = "id") String id){
        System.out.println(id);
        return id;
    }

    @GetMapping("/test1/{id}")
    public  String test1(@PathVariable(value = "id") String id){
        System.out.println(id);
        System.out.println(userService.findById(id));
        return JSON.toJSONString(userService.findById(id));
    }
    @PutMapping("/{name}")
    public  int test2(@PathVariable(value = "name") String name){
        System.out.println(name);
        User user = new User();
        user.setName(name);
        return userService.insertUser(user);
    }

    @GetMapping("/one2one/{id}")
    public  String testOne2One(@PathVariable(value = "id") String id){
        System.out.println(id);
        return JSON.toJSONString(userService.findById(id));
    }
    @GetMapping("/one2many/{id}")
    public  String testOne2many(@PathVariable(value = "id") String id){
        System.out.println(id);
        return JSON.toJSONString(classRoomService.findById(Integer.valueOf(id)));
    }



}
