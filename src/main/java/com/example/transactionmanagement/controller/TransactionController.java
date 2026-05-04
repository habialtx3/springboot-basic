package com.example.transactionmanagement.controller;

import com.example.transactionmanagement.service.TransactionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class TransactionController {

@Autowired
private TransactionServiceInterface transactionService;



    @GetMapping("/transactions")
    public String getAllTransaction() {
        return "Hello from transaction";
    }

    @GetMapping("/transactions/{references}")
    public String getOneTransaction() {
        return "Hello from transaction";
    }

    @PostMapping("/transactions")
    public String createTransaction() {
        return "Hello from transaction";
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
