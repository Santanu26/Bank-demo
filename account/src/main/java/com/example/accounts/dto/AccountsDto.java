package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name="Account",
        description = "Schema to hold Account info."
)
public class AccountsDto {
    @Schema(
            description = "Account must be 3-30 characters"
    )
    @NotEmpty(message = "Account number must not be null or empty")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Account number must be 10 digits")
    private Long accountNumber;
    @NotEmpty(message = "Account type must not be null or empty")
    private String accountType;
    @NotEmpty(message = "Branch address must not be null or empty")
    private String branchAddress;
}
