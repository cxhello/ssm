package com.cxhello.ssm.service.impl;

import com.cxhello.ssm.dao.UserDao;
import com.cxhello.ssm.entity.User;
import com.cxhello.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CaiXiaoHui
 * @create 2019/12/17 20:43
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }
}
