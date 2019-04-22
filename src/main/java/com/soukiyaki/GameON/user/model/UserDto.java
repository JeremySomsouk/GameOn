package com.soukiyaki.GameON.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    @JsonProperty("user_name")
    private String userName;

    private Integer age;
}
