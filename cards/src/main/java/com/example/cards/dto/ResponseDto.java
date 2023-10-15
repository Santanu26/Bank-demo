package com.example.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
        name="API Response",
        description = "API response with status code and status message"
)
public class ResponseDto {
    private String statusCode;
    private String statusMsg;
}
