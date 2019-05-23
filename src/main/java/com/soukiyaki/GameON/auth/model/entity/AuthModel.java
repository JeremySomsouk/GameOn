package com.soukiyaki.GameON.auth.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Users")
public class AuthModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String authId;

    protected AuthModel() {}

    public AuthModel(String authId) {
        this.authId = authId;
    }
}
