package com.soukiyaki.GameON.auth.resource;

import com.soukiyaki.GameON.auth.model.AuthDto;
import com.soukiyaki.GameON.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthResource {

    private AuthService authService;

    @Autowired
    AuthResource(AuthService authService) {
        this.authService = authService;
    }

    public void saveAuth(AuthDto authDto) {
        authService.saveAuth(authDto);
    }
}