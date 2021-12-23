package com.mo.junit;

import com.mo.controller.UserController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyTest {
    @Autowired
    private UserController userController;
    @Test

    public static void main(String[] args) {
        new  UserController().getGetUser();
    }
}
