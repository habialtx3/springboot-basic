package com.example.transactionmanagement.repository;

import com.example.transactionmanagement.entity.TransactionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface TransactionRepository extends JpaRepository<TransactionEntity, UUID> {

    @Query(value = "SELECT id,reference,amount,status FROM transactions t ORDER BY t.created_at DESC", countQuery = "SELECT (id) FROM transactions", nativeQuery = true)
    Page<TransactionEntity> getAllTransaction(Pageable pageable);

    Optional<TransactionEntity> findByReference(String reference);
}
