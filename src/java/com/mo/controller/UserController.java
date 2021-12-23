package com.mo.controller;

import com.mo.dao.GetUser;
import com.mo.service.GetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.RequestingUserName;

@Controller
@RestController
public class UserController {
    @Autowired
    private GetUserService getUser;
    
    public  void getGetUser() {
        String  s="mo";
        getUser.getUser(s);
    }
}
