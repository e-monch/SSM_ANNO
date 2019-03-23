package cn.monch.controller;

import cn.monch.entity.User;
import cn.monch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping(value = "/findAll", produces = "text/html;charset=UTF-8")
    public List<User> getAll()
    {
        List<User> all = userService.findAll();
        return all;
    }

    @GetMapping(value = "/hello")
    public String hello()
    {
        return "demo";
    }
}