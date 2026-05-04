package com.example.transactionmanagement.service.impl;

import com.example.transactionmanagement.dto.PaginationResponse;
import com.example.transactionmanagement.entity.TransactionEntity;
import com.example.transactionmanagement.service.TransactionServiceInterface;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionServiceInterface{

    @Override
    public PaginationResponse<?> getAllTransaction(Pageable pageable) {
        return null;
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
    public TransactionEntity createTransaction(Pageable pageable) {
        return null;
    }

    @Override
    public void deleteTransaction(String id) {

    }
}