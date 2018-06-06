package cn.oyr.controller;

import cn.oyr.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Create by 欧阳荣
 * 2018/6/7 0:12
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Resource
    private UserService service;

    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password){
        String str = service.login(username, password);
        return str;
    }
}
