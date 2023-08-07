package com.example.artemis.listener;

import com.example.artemis.config.ArtemisConfig;
import com.example.artemis.entities.Phone;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ArtemisListener {

    private final ObjectMapper objectMapper;

    public ArtemisListener(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    @JmsListener(destination = ArtemisConfig.QUEUE)
    public void getData(String msg) throws JsonProcessingException {
        Phone phone = objectMapper.readValue(msg, Phone.class); // Object mapper kullanarak gelen veriyi tekrardan phone nesnesine dönüştürme.
        ArtemisConfig.phoneList.add(phone);
        log.info(msg);
    }
}
