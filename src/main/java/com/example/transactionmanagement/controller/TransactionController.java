package com.example.transactionmanagement.controller;

import com.example.transactionmanagement.dto.CreateTransactionPayload;
import com.example.transactionmanagement.dto.PaginationResponse;
import com.example.transactionmanagement.entity.TransactionEntity;
import com.example.transactionmanagement.service.TransactionServiceInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class TransactionController {

    @Autowired
    private TransactionServiceInterface transactionService;


    @GetMapping("/transactions")
    public PaginationResponse<TransactionEntity> getAllTransaction(@PageableDefault(size = 10, sort = "created_at") Pageable pageable) {
        return transactionService.getAllTransaction(pageable);
    }

    @GetMapping("/transactions/{reference}")
    public String getOneTransaction() {
        return "Hello from transaction";
    }

    @PostMapping("/transactions")
    public TransactionEntity createTransaction(@Valid @RequestBody CreateTransactionPayload payload) {
        return transactionService.createTransaction(payload);
    }

    @PutMapping("/transactions/{id}")
    public String updateTransaction() {
        return "Hello from transaction";
    }

    @DeleteMapping("/transactions")
    public String deleteTransaction() {
        return "Hello from transaction";
    }

}
