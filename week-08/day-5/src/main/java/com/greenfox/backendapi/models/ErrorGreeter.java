package com.greenfox.backendapi.models;

public class ErrorGreeter {
    private String error;


    public ErrorGreeter(String errorSms) {
        this.error = errorSms;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
