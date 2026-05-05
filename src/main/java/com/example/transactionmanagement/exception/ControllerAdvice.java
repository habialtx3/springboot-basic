package com.example.transactionmanagement.exception;

import com.example.transactionmanagement.utils.BaseResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<BaseResponse<Void>> handleNotFoundException(EntityNotFoundException ex) {
        return ResponseEntity.badRequest().body(
                BaseResponse.<Void>builder().code(String.valueOf(HttpStatus.NOT_FOUND)).messages(ex.getMessage()).build()
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<BaseResponse<Map<String,String>>> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
        Map<String, String> fieldError = ex.getBindingResult().getFieldErrors().stream().collect(Collectors.toMap(
                FieldError::getField,
                FieldError::getDefaultMessage,
                (a, b) -> a
        ));

        BaseResponse<Map<String, String>> response = BaseResponse
                .<Map<String, String>>builder().code("VALIDATION ERROR")
                .messages("Request Validation Error").data(fieldError)
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

}
