package com.example.testingweb.poc;

import org.springframework.stereotype.Component;

@Component
public class LoanRepository {
    public Loan findLoanById(Long loanId) {
        // Imagine this is querying a database
    	System.out.println("this is real repository at work");
        return null;  // In reality, it would fetch data from DB
    }

    public void saveLoan(Loan loan) {
        // Imagine this saves the loan to a database
    	System.out.println("this is real save loan kind of example");
    }
}