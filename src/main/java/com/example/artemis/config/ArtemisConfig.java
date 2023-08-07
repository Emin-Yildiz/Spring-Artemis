package com.example.artemis.config;

import com.example.artemis.entities.Phone;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ArtemisConfig {
    public static final String QUEUE = "phone";
    public static List<Phone> phoneList = new ArrayList<>();
}
