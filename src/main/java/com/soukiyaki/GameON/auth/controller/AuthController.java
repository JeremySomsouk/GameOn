package com.soukiyaki.GameON.auth.controller;

import com.soukiyaki.GameON.auth.model.AuthDto;
import com.soukiyaki.GameON.auth.resource.AuthResource;
import com.soukiyaki.GameON.common.model.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.soukiyaki.GameON.common.Checks.checkIfNullOrEmptyParameter;
import static com.soukiyaki.GameON.common.model.ResponseDto.getHttpResponse;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class AuthController {

    private AuthResource authResource;

    @Autowired
    AuthController(AuthResource authResource) {
        this.authResource = authResource;
    }

    @RequestMapping(method = POST, value = "/auth", consumes = "application/json", produces = "application/json")
    public ResponseDto createUser(@RequestBody AuthDto authDto) {

        checkIfNullOrEmptyParameter(authDto.getAuthId(), "AuthId is not provided (null) or empty");

        authResource.saveAuth(authDto);
        return getHttpResponse("success", 200);
    }
}