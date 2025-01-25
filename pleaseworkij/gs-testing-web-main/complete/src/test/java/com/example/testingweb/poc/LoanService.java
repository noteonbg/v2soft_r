package com.example.testingweb.poc;

public class LoanService {

	private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Loan getLoanById(Long loanId) {
        return loanRepository.findLoanById(loanId);
    }

    public void approveLoan(Loan loan) {
        loan.setStatus("approved");
        loanRepository.saveLoan(loan);
    }
}
