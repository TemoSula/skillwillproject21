package com.example.skillwillproject21.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public class ExceptionBody {
    private HttpStatusCode httpStatus;
    private List<String> message;

    public HttpStatusCode getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatusCode httpStatus) {
        this.httpStatus = httpStatus;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }
}
