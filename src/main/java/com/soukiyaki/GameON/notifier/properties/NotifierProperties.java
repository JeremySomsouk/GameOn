package com.soukiyaki.GameON.notifier.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class NotifierProperties {

    @Value("${users.db.name:db1}")
    private String dbName;
}
