package com.example.skillwillproject21.ExceptionHandling;

import jakarta.validation.UnexpectedTypeException;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException methodArg)
    {
        ExceptionBody exceptionBody = new ExceptionBody();
        List<FieldError> fieldErrorList = methodArg.getFieldErrors();
        List<String> messages = new ArrayList<>();
        for(FieldError fe : fieldErrorList)
        {
            messages.add(fe.getField() + " " + fe.getDefaultMessage());
        }
        exceptionBody.setMessage(messages);
        exceptionBody.setHttpStatus(methodArg.getStatusCode());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionBody);
    }


}
