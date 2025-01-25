package lifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class LoanApplicationService implements InitializingBean, DisposableBean {

    private String applicantName;
    private double loanAmount;

    // Default constructor
    public LoanApplicationService() {
        System.out.println("LoanApplicationService: Constructor called");
    }

    // Setter for applicant name (Dependency Injection)
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    // Setter for loan amount (Dependency Injection)
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // This method is invoked after properties are set and the bean is fully initialized
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LoanApplicationService: Initialization method called");
        if (applicantName == null || loanAmount <= 0) {
            throw new IllegalArgumentException("Invalid loan application");
        }
    }

    // The main service method
    public void processLoanApplication() {
        System.out.println("Processing loan for applicant: " + applicantName);
        System.out.println("Loan amount requested: " + loanAmount);
        // Logic to process loan application (e.g., check credit, approve/reject loan)
        if (loanAmount > 100000) {
            System.out.println("Loan application denied. Amount exceeds limit.");
        } else {
            System.out.println("Loan application approved.");
        }
    }

    // Cleanup method when the bean is destroyed
    @Override
    public void destroy() throws Exception {
        System.out.println("LoanApplicationService: Cleanup method called");
    }
}
