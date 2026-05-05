package com.example.transactionmanagement.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@Getter
@Setter
public class UpdateTransactionPayload {
    @NotNull(message = "required amount fields")
    @PositiveOrZero(message = "amount must be zero or more than zero")
    private BigDecimal amount;
}
