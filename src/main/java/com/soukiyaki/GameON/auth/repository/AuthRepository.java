package com.soukiyaki.GameON.auth.repository;

import com.soukiyaki.GameON.auth.model.entity.AuthModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthRepository extends CrudRepository<AuthModel, Long> {

}