package cn.monch.controller;

import cn.monch.entity.User;
import cn.monch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public String getAll()
    {
        List<User> all = userService.findAll();
        return all.toString();
    }
}