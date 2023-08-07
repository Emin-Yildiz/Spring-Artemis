package com.example.artemis.service;

import com.example.artemis.config.ArtemisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {

    @Autowired
    private final JmsTemplate jmsTemplate;

    public SendService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public String sendMsh(String msg) {
        jmsTemplate.convertAndSend(ArtemisConfig.QUEUE,msg);
        return "Message sending";
    }
}
