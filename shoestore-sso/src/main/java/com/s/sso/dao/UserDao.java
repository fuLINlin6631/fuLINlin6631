package com.s.sso.dao;

import com.s.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    Users login(@Param("userEmail") String userEmail,@Param("userpwd") String userpwd);
}
