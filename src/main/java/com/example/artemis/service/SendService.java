package com.example.artemis.service;

import com.example.artemis.config.ArtemisConfig;
import com.example.artemis.entities.Phone;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {

    private final JmsTemplate jmsTemplate;
    private final ObjectMapper objectMapper;

    public SendService(JmsTemplate jmsTemplate,ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        this.jmsTemplate = jmsTemplate;
    }

    public String sendMsg(String msg) {
        jmsTemplate.convertAndSend(ArtemisConfig.QUEUE,msg);
        return "Message sending";
    }

    public Phone sendPhone(Phone phone) throws JsonProcessingException {
        /*
        nesneleri her zaman string'e dönüştürüp atmak gerekir.
         */
        String phoneMessage = objectMapper.writeValueAsString(phone);
        jmsTemplate.convertAndSend(ArtemisConfig.QUEUE,phoneMessage);
        return phone;
    }
}
