package com.s.interfac;

import com.s.utils.SystemResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
    SystemResult login(String userEmail, String userpwd, HttpServletResponse response, HttpServletRequest request);
    SystemResult getUserByToken(String token);
}
