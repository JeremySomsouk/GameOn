package com.soukiyaki.GameON.user.repository;

import com.soukiyaki.GameON.user.model.entity.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<UserModel, Long> {

}