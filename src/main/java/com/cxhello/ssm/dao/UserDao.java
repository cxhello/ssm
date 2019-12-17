package com.cxhello.ssm.dao;

import com.cxhello.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author CaiXiaoHui
 * @create 2019/12/17 20:37
 */
public interface UserDao {

    public User selectUserById(@Param("id") Integer id);
}
