package com.greenfox.backendapi.services;

import com.greenfox.backendapi.models.Greeter;

public interface GreeterService {
    Greeter greetingSms(String name, String title);
}
