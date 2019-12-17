package com.cxhello.ssm.service;

import com.cxhello.ssm.entity.User;

/**
 * @author CaiXiaoHui
 * @create 2019/12/17 20:42
 */
public interface UserService {

    public User selectUserById(Integer id);
}
