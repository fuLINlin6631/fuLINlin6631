package com.s.view.controller;

import com.s.interfac.UserService;
import com.s.utils.SystemResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public SystemResult login(String userEmail, String userpwd, HttpServletResponse response, HttpServletRequest request){
        //从返回结果中取token，写入cookie。Cookie要跨域。
        SystemResult systemResult = userService.login(userEmail,userpwd,response,request);
        return systemResult;
    }
    @ResponseBody
    @RequestMapping("/token/{token}")
    public Object getUserByToken(@PathVariable String token){
        SystemResult result = userService.getUserByToken(token);
        return result;
    }

    @RequestMapping("/passport-login.html")
    public String passportlogin(){
        return "passport-login";
    }

    @RequestMapping("/ceshi.html")
    public String ceshi(){
        return "ceshi";
    }

}
