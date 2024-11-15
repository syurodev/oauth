package com.zen.oauth.service;

import com.zen.oauth.entity.User;

public interface UserService {
    User findByUsername(String username);
}
