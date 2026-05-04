package com.example.transactionmanagement.service;

import com.example.transactionmanagement.dto.CreateTransactionPayload;
import com.example.transactionmanagement.dto.PaginationResponse;
import com.example.transactionmanagement.entity.TransactionEntity;
import org.springframework.data.domain.Pageable;

public interface TransactionServiceInterface {
    PaginationResponse<TransactionEntity> getAllTransaction (Pageable pageable);
    TransactionEntity getOneTransaction (String references);
    TransactionEntity updateTransaction (String idm, Object payload);
    TransactionEntity createTransaction (CreateTransactionPayload payload);
    void deleteTransaction (String id);
}
