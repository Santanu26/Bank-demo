package com.example.cards.service;

import com.example.cards.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("accounts")
public interface AccountsFeignClient {
    @GetMapping("/api/fetch")
    ResponseEntity<CustomerDto> fetchAccount(@RequestParam String mobileNumber);
}
