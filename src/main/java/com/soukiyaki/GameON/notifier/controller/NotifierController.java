package com.soukiyaki.GameON.notifier.controller;

import com.soukiyaki.GameON.common.model.ResponseDto;
import com.soukiyaki.GameON.notifier.model.PushDto;
import com.soukiyaki.GameON.notifier.resource.NotifierResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.soukiyaki.GameON.common.Checks.checkIfNullOrEmptyParameter;
import static com.soukiyaki.GameON.common.model.ResponseDto.getHttpResponse;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class NotifierController {

    private NotifierResource notifierResource;

    @Autowired
    NotifierController(NotifierResource notifierResource) {
        this.notifierResource = notifierResource;
    }

    @RequestMapping(method = POST, value = "/notifier", consumes = "application/json", produces = "application/json")
    public ResponseDto createUser(@RequestBody PushDto pushDto) {

        checkIfNullOrEmptyParameter(pushDto.getFirebaseId(), "FirebaseId is not provided (null) or empty");

        notifierResource.saveId(pushDto);
        return getHttpResponse("success", 200);
    }
}