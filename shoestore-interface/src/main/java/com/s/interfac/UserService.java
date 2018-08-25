package com.s.interfac;

import com.s.utils.SystemResult;

public interface UserService{

    SystemResult login(String userEmail, String userpwd);

    SystemResult getUserByToken(String token);

    void loginout(String token);
}
