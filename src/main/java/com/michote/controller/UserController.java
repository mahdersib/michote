package com.michote.controller;

import com.michote.responseObjects.UserResponse;
import com.michote.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jtq603 on 10/23/16.
 */

@Controller
public class UserController {
    /**
     * /create  --> Create a new user and save it in the database.
     *
     * @param userResponse
     * @return A string describing if the user is succesfully created or not.
     */
    @Autowired
    private UserServiceInterface userServiceInterface;

    @RequestMapping(value = "user/create", method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestBody UserResponse userResponse) {
        return userServiceInterface.create(userResponse);
    }
}
