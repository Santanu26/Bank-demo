package com.example.accounts.service;

import com.example.accounts.dto.CustomerDto;

public interface AccountsService {


    /**
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccountDetails(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteByMobileNumber(String mobileNumber);
}
