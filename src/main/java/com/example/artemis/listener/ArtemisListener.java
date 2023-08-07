package com.example.artemis.listener;

import com.example.artemis.config.ArtemisConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ArtemisListener {

    @JmsListener(destination = ArtemisConfig.QUEUE)
    public void getData(String msg){
        log.info(msg);
    }
}
