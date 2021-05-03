package com.greenfox.backendapi.services;

import com.greenfox.backendapi.models.Greeter;
import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements  GreeterService{
    @Override
    public Greeter greetingSms(String name, String title) {
        return  new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
    }
}
