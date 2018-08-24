package com.s.view.controller;

import com.alibaba.fastjson.JSON;
import com.s.entity.Users;
import com.s.interfac.UserService;
import com.s.utils.CookieUtils;
import com.s.utils.SystemResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController  {

    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public String callback="index.htm";

    @RequestMapping("/login.htm")
    public String login(String userEmail, String userpwd,HttpServletResponse response,HttpServletRequest request){
        //从返回结果中取token，写入cookie。Cookie要跨域。
        SystemResult systemResult = userService.login(userEmail,userpwd);
        //设置cookie的key和value，key随便字符串，value为token值
        if (systemResult.getData()!=null){
            String temp = stringRedisTemplate.opsForValue().get("user:"+systemResult.getData().toString());
            Users users = JSON.parseObject(temp,Users.class);
            request.getSession().setAttribute("users",users);
            CookieUtils.setCookie(request,response,"user",systemResult.getData().toString());
            return "redirect:/"+callback;
        }else{
            request.getSession().setAttribute("message",systemResult.getMessage());
            return "redirect:/passport-login.htm";
        }
    }
    @ResponseBody
    @RequestMapping("/token/{token}")
    public Object getUserByToken(@PathVariable String token,String callback){
        this.callback = callback;
        SystemResult result = userService.getUserByToken(token);
        return result;
    }

    @RequestMapping("/index.htm")
    public String index(){
        return "index";
    }

    @RequestMapping("/passport-login.htm")
    public String passportlogin(){
        return "passport-login";
    }

    @RequestMapping("/loginout/{token}")
    public String loginout(@PathVariable String token,HttpServletRequest request){
        userService.loginout(token);
        request.getSession().removeAttribute("users");
        return "redirect:/index.htm";
    }

    @RequestMapping("/ceshi.htm")
    public String ceshi(){
        return "ceshi";
    }
    @RequestMapping("/member-orders.htm")
    public String memberorders(){
        return "member-orders";
    }
    @RequestMapping("/member-index.htm")
    public String memberindex(){
        return "member-index";
    }
    @RequestMapping("/member-security.htm")
    public String membersecurity(){
        return "member-security";
    }
    @RequestMapping("/member-setting.htm")
    public String membersetting(){
        return "member-setting";
    }

}
