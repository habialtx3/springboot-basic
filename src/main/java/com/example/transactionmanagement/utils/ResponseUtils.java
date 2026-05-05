package com.example.transactionmanagement.utils;

import org.springframework.http.ResponseEntity;

public class ResponseUtils {

    public static <T>ResponseEntity<BaseResponse<T>> success (T data, String message) {
        return ResponseEntity.ok(
                BaseResponse.<T>builder().code("Success").messages(message).data(data).build()
        );
    }

    public static ResponseEntity<BaseResponse> successNoContent (String message) {
        return ResponseEntity.ok(
                BaseResponse.builder().code("SUCESS_NO_CONTENT").messages(message).build()
        );
    }

}
