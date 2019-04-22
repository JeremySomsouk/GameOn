package com.soukiyaki.GameON.user.resource;

import com.soukiyaki.GameON.user.model.UserDto;
import com.soukiyaki.GameON.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserResource {

    private UserService userService;

    @Autowired
    UserResource(UserService userService) {
        this.userService = userService;
    }

    public void createUser(UserDto userDto) {
        userService.createUser(userDto);
    }
}