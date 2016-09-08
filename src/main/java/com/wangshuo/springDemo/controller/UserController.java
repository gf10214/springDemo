package com.wangshuo.springDemo.controller;

import com.wangshuo.springDemo.entity.User;
import com.wangshuo.springDemo.servcie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wangshuo on 2016/9/8 0008.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/list")
    public String datagrid(Model model){
        List<User> users=userService.getUser();
        model.addAttribute("user",users);
        return "user/userList";
    }
}
