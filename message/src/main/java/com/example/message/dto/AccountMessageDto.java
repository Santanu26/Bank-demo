package com.example.message.dto;

/**
 * @param accountNumber
 * @param name
 * @param email
 * @param mobileNumber
 */
public record AccountMessageDto(Long accountNumber, String name, String email, String mobileNumber) {
}
