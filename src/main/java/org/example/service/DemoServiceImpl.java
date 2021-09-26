package org.example.service;

import org.example.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getHelloMessage(String user) {
        return "Hello "+user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Demo Application";
    }
}
