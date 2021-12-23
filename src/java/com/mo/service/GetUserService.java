package com.mo.service;

import com.mo.controller.UserController;
import org.springframework.stereotype.Service;

@Service
public class GetUserService {
    public  void getUser(String s) {
        System.out.println(s);
    }
}
