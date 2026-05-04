package com.example.transactionmanagement.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.query.Meta;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class BaseResponse <T>{

    private String code;
    private String messages;
    private T data;
    private Meta meta;

    public static class Meta {
        private Integer page;
        private Integer size;
        private Long totalElement;
        private Integer totalPage;

    }
}
