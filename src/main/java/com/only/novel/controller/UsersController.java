package com.only.novel.controller;

import com.only.novel.entity.Users;
import com.only.novel.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/getAllUser")
    public Map<String,Object> getUsersList(){

        Map<String,Object> map = new HashMap<>();

        map.put("code",2000);
        map.put("data",usersService.getUsersList());
        return map;
    }

    @GetMapping("/insertUser")
    public Object add(Users users){
        int i = usersService.addUser(users);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","添加成功！");
        } else {
            map.put("msg","添加失败！");
        }
        return map;
    }

    @GetMapping("/deleteUser")
    public Object delete(Users users){
        int i = usersService.deleteUser(users);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","删除成功！");
        } else {
            map.put("msg","删除失败！");
        }
        return map;
    }

    @GetMapping("/updateUser")
    public Object update(Users users){
        int i = usersService.updateUser(users);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","更新成功！");
        } else {
            map.put("msg","更新失败！");
        }
        return map;
    }
}
