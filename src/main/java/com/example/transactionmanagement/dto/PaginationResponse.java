package com.example.transactionmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor

public class PaginationResponse <T> {
    public int count;
    public long total;
    public List<T> data;
}
