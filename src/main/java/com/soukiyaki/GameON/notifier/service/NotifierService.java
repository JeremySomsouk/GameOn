package com.soukiyaki.GameON.notifier.service;

import com.soukiyaki.GameON.notifier.model.PushDto;
import com.soukiyaki.GameON.notifier.model.entity.PushModel;
import com.soukiyaki.GameON.notifier.repository.NotifierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotifierService {

    private NotifierRepository notifierRepository;

    @Autowired
    NotifierService(NotifierRepository notifierRepository) {
        this.notifierRepository = notifierRepository;
    }

    public void createUser(PushDto pushDto) {
        notifierRepository.save(new PushModel(pushDto.getFirebaseId()));
    }
}