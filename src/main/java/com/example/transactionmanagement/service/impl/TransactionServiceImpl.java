package com.example.transactionmanagement.service.impl;

import com.example.transactionmanagement.dto.CreateTransactionPayload;
import com.example.transactionmanagement.dto.PaginationResponse;
import com.example.transactionmanagement.entity.TransactionEntity;
import com.example.transactionmanagement.repository.TransactionRepository;
import com.example.transactionmanagement.service.TransactionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionServiceInterface{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public PaginationResponse<TransactionEntity> getAllTransaction(Pageable pageable) {
        Page<TransactionEntity> transactionEntities = transactionRepository.getAllTransaction(pageable);
        return new PaginationResponse<>(
                transactionEntities.getNumberOfElements(),
                transactionEntities.getTotalElements(),
                transactionEntities.getContent()
        );
    }

    @Override
    public TransactionEntity getOneTransaction(String references) {
        return null;
    }

    @Override
    public TransactionEntity updateTransaction(String idm, Object payload) {
        return null;
    }

    @Override
    public TransactionEntity createTransaction(CreateTransactionPayload payload) {
        TransactionEntity transactionEntity = TransactionEntity.builder()
                .status("success")
                .amount((payload.getAmount()))
                .reference(payload.getReference())
                .build();
        return transactionRepository.save(transactionEntity);
    }

    @Override
    public void deleteTransaction(String id) {

    }
}