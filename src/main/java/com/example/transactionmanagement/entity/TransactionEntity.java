package com.example.transactionmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class TransactionEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition ="uuid",nullable = false,updatable = false)
    private UUID id;

    @Column(nullable = false,updatable = false, length = 50)
    private String reference;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private String status;


}
