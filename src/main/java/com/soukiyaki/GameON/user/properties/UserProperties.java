package com.soukiyaki.GameON.user.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class UserProperties {

    @Value("${users.db.name:db1}")
    private String dbName;
}
