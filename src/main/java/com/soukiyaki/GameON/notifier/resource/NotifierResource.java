package com.soukiyaki.GameON.notifier.resource;

import com.soukiyaki.GameON.notifier.model.PushDto;
import com.soukiyaki.GameON.notifier.service.NotifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotifierResource {

    private NotifierService notifierService;

    @Autowired
    NotifierResource(NotifierService notifierService) {
        this.notifierService = notifierService;
    }

    public void saveId(PushDto pushDto) {
        notifierService.createUser(pushDto);
    }
}