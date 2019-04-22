package com.soukiyaki.GameON.user.controller;

import com.soukiyaki.GameON.common.model.ResponseDto;
import com.soukiyaki.GameON.user.model.UserDto;
import com.soukiyaki.GameON.user.resource.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.soukiyaki.GameON.common.Checks.checkIfNullOrEmptyParameter;
import static com.soukiyaki.GameON.common.Checks.checkIfNullParameter;
import static com.soukiyaki.GameON.common.model.ResponseDto.getHttpResponse;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class UserController {

    private UserResource userResource;

    @Autowired
    UserController(UserResource userResource) {
        this.userResource = userResource;
    }

    @RequestMapping(method = POST, value = "/users", consumes = "application/json", produces = "application/json")
    public ResponseDto createUser(@RequestBody UserDto userDto) {

        checkIfNullOrEmptyParameter(userDto.getUserName(), "Username is not provided (null) or empty");
        checkIfNullParameter(userDto.getAge(), "Age is not provided (null)");

        userResource.createUser(userDto);
        return getHttpResponse("success", 200);
    }
}