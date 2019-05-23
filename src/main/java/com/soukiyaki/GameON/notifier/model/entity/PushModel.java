package com.soukiyaki.GameON.notifier.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Users")
public class PushModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firebaseId;

    protected PushModel() {}

    public PushModel(String firebaseId) {
        this.firebaseId = firebaseId;
    }
}
