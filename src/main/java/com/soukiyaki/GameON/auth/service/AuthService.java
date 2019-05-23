package com.soukiyaki.GameON.auth.service;

import com.soukiyaki.GameON.auth.model.AuthDto;
import com.soukiyaki.GameON.auth.model.entity.AuthModel;
import com.soukiyaki.GameON.auth.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private AuthRepository authRepository;

    @Autowired
    AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public void saveAuth(AuthDto authDto) {
        authRepository.save(new AuthModel(authDto.getAuthId()));
    }
}