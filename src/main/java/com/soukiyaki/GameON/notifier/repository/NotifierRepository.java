package com.soukiyaki.GameON.notifier.repository;

import com.soukiyaki.GameON.notifier.model.entity.PushModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface NotifierRepository extends CrudRepository<PushModel, Long> {

}