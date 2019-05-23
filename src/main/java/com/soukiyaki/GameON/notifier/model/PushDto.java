package com.soukiyaki.GameON.notifier.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PushDto {

    @JsonProperty("firebase_id")
    private String firebaseId;
}
