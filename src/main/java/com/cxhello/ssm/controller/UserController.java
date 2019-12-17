package com.cxhello.ssm.controller;

import com.cxhello.ssm.entity.User;
import com.cxhello.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CaiXiaoHui
 * @create 2019/12/17 20:44
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectUserById/{id}")
    public String selectUserById(@PathVariable Integer id,Model model){
        User user = userService.selectUserById(id);
        model.addAttribute("user",user);
        return "/user/list";
    }
}
