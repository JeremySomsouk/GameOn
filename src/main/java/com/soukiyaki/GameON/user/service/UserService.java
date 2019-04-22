package com.soukiyaki.GameON.user.service;

import com.soukiyaki.GameON.user.model.UserDto;
import com.soukiyaki.GameON.user.model.entity.UserModel;
import com.soukiyaki.GameON.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserDto userDto) {
        userRepository.save(new UserModel(userDto.getUserName(), userDto.getAge()));
    }
}