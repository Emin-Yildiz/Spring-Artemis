package com.example.artemis.controller;

import com.example.artemis.config.ArtemisConfig;
import com.example.artemis.entities.Phone;
import com.example.artemis.service.SendService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class SendController {

    private final SendService sendService;

    public SendController(SendService sendService){
        this.sendService = sendService;
    }

    @PostMapping()
    public ResponseEntity<Phone> sendMsg(@RequestBody Phone phone) throws JsonProcessingException {
        return new ResponseEntity<>(sendService.sendPhone(phone),HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Phone>> getPhones(){
        return new ResponseEntity<>(ArtemisConfig.phoneList,HttpStatus.OK);
    }
}
