package com.zen.oauth.service.impl;

import com.zen.oauth.dao.UserDao;
import com.zen.oauth.entity.User;
import com.zen.oauth.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserService")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
