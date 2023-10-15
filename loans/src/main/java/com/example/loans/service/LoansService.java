package com.example.loans.service;

import com.example.loans.dto.LoansDto;

public interface LoansService {

    void createLoan(String mobileNumber);

    boolean updateLoan(LoansDto loansDto);

    boolean deleteLoan(String mobileNumber);

    LoansDto fetchLoan(String mobileNumber);
}
