package com.greenfox.backendapi.services;

import org.springframework.stereotype.Service;

@Service
public class DoUntilServiceImpl implements DoUntilService {
    @Override
    public Integer Factorial(Integer until) {
        if (until <= 1) {
            return 1;
        } else {
            return until * Factorial(until - 1);
        }

    }

    @Override
    public Integer Sum(Integer until) {
        var result = 0;
        for (int i = until; i > 0 ; i--) {
            result = result + i;

        }
        return result;
    }
}
