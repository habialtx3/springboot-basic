package com.example.transactionmanagement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@Getter
@Setter
public class CreateTransactionPayload {
    @NotBlank(message = "required reference field")
    private String reference;

    @NotNull(message = "required amount fields")
    @PositiveOrZero(message = "amount must be zero or more than zero")
    private BigDecimal amount;

}
