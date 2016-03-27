package com.assessment.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.pojo.User;

@RestController
public class UserController {

    @RequestMapping(value="/user", method=RequestMethod.GET)
    public User getUserName() {
        System.out.println("inside user name method");
        User user = new User();
        user.setUserName("test");
        return user;
    }
}
