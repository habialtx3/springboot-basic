package com.example.transactionmanagement.exception;

import com.example.transactionmanagement.utils.BaseResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<BaseResponse<Void>> handleNotFoundException(EntityNotFoundException ex) {
        return ResponseEntity.badRequest().body(
                BaseResponse.<Void>builder().code(String.valueOf(HttpStatus.NOT_FOUND)).messages(ex.getMessage()).build()
        );
    }
}
