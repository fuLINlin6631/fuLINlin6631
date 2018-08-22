package com.s.sso.dao.Impl;

import com.alibaba.fastjson.JSON;
import com.s.entity.Users;
import com.s.interfac.UserService;
import com.s.sso.dao.UserDao;
import com.s.utils.CookieUtils;
import com.s.utils.SystemResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class UserDaoImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public SystemResult login(String userEmail, String userpwd, HttpServletResponse response, HttpServletRequest request) {
        Users users = userDao.login(userEmail,userpwd);
        if (users==null) {
            return SystemResult.build(400,"用户名or密码有误，请重新输入");
        }else{
            String token = UUID.randomUUID().toString();
            users.setUserpwd(null);
            String json = JSON.toJSONString(users);
            stringRedisTemplate.opsForValue().set("user:"+token, json);
            stringRedisTemplate.expire("user:"+token,30, TimeUnit.MINUTES);
            //设置cookie的key和value，key随便字符串，value为token值
            CookieUtils.setCookie(request,response,"user",token);
            return SystemResult.ok(token);
        }
    }

    @Override
    public SystemResult getUserByToken(String token) {
        // 根据token取用户信息
        String json = stringRedisTemplate.opsForValue().get("user:"+token);
        if (json==null){
            return SystemResult.build(400,"用户session已经过期");
        }else{
            //把json转换成java对象
            Users users = JSON.parseObject(json,Users.class);
            //更新过期时间
            stringRedisTemplate.expire("user:"+token,30,TimeUnit.MINUTES);
            return SystemResult.ok(users);
        }
    }
}
