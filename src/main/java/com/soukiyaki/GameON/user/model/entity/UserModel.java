package com.soukiyaki.GameON.user.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private Integer age;

    protected UserModel() {}

    public UserModel(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
}
