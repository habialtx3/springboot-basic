package com.example.transactionmanagement.controller;

import com.example.transactionmanagement.dto.CreateTransactionPayload;
import com.example.transactionmanagement.dto.PaginationResponse;
import com.example.transactionmanagement.entity.TransactionEntity;
import com.example.transactionmanagement.service.TransactionServiceInterface;
import com.example.transactionmanagement.utils.BaseResponse;
import com.example.transactionmanagement.utils.ResponseUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<BaseResponse<TransactionEntity>> getOneTransaction(@PathVariable String reference) {
        return ResponseUtils.success(transactionService.getOneTransaction(reference), "Sucessfully get one data");
//        return transactionService.getOneTransaction(reference);
    }

    @PostMapping("/transactions")
    public ResponseEntity<BaseResponse<TransactionEntity>> createTransaction(@Valid @RequestBody CreateTransactionPayload payload) {
        return ResponseUtils.success(transactionService.createTransaction(payload),"Succesfully created data");
        //        return transactionService.createTransaction(payload);
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
