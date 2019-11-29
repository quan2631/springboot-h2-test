package com.example.demo.controller;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: QUAN
 * @date: Created in 2019/11/28 16:59
 * @description:
 * @modified By:
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository repo;

    @RequestMapping("find")
    public List<User> find() {
        return (List<User>) repo.findAll();
    }
}
