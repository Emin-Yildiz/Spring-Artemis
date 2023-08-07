package com.example.artemis.controller;

import com.example.artemis.service.SendService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class SendController {

    private final SendService sendService;

    public SendController(SendService sendService){
        this.sendService = sendService;
    }

    @PostMapping("/{msg}")
    public ResponseEntity<String> sendMsg(@PathVariable String msg){
        return new ResponseEntity<>(sendService.sendMsh(msg),HttpStatus.CREATED);
    }
}
