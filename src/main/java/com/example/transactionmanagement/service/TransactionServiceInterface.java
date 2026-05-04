package com.example.transactionmanagement.service;

import com.example.transactionmanagement.dto.PaginationResponse;
import com.example.transactionmanagement.entity.TransactionEntity;
import org.springframework.data.domain.Pageable;

public interface TransactionServiceInterface {
    PaginationResponse<?> getAllTransaction (Pageable pageable);
    TransactionEntity getOneTransaction (String references);
    TransactionEntity updateTransaction (String idm, Object payload);
    TransactionEntity createTransaction (Pageable pageable);
    void deleteTransaction (String id);
}
