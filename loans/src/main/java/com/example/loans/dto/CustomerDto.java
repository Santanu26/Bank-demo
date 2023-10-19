package com.example.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account info."
)
public class CustomerDto {
    @Schema(
            description = "Name must be 3-30 characters"
    )
    @NotEmpty(message = "Customer name must not be null or empty")
    @Size(min = 3, max = 30,message = "Customer name should be 3-10 characters only")
    private String name;
    @NotEmpty(message = "Email must not be null or empty")
    @Email(message = "Please put the valid email value")
    private String email;
    @Schema(
            description = "Mobile number must be 10 digits"
    )
    @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
