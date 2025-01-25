package com.example.testingweb.poc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class LoanServiceTest {

    @InjectMocks
    private LoanService loanService;  // This will create an instance of LoanService and inject mocked LoanRepository

    @Mock
    private LoanRepository loanRepository;  // This will create a mock of LoanRepository

    @BeforeEach
    public void setUp() {
       //  Initialize the mocks before each test (important for Mockito annotations)
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetLoanById() {
        // Arrange: Mock the behavior of loanRepository
        Loan mockLoan = new Loan();
        mockLoan.setId(1L);
        mockLoan.setAmount(5000.0);
        mockLoan.setStatus("pending");

      //  when(loanRepository.findLoanById(1L)).thenReturn(mockLoan);  // Mock the method call

        // Act: Call the service method
        Loan loan = loanService.getLoanById(1L);

        // Assert: Verify the returned loan
        assertNotNull(loan);
        assertEquals(Long.valueOf(1), loan.getId(),"did not get the result");
        assertEquals("pending", loan.getStatus());

        // Verify that the loanRepository's findLoanById was called once
        verify(loanRepository, times(1)).findLoanById(1L);
    }

    @Test
    public void testApproveLoan() {
        // Arrange: Create a loan object
        Loan loanToApprove = new Loan();
        loanToApprove.setId(2L);
        loanToApprove.setAmount(10000.0);

        // Act: Approve the loan
        loanService.approveLoan(loanToApprove);

        // Assert: Verify the loan status is updated
        assertEquals("approved", loanToApprove.getStatus());

        // Verify that saveLoan was called once with the approved loan
        verify(loanRepository, times(1)).saveLoan(loanToApprove);
    }
}

