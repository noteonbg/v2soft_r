package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoanApplicationApp {

    public static void main(String[] args) {
        // Load Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");

        // Retrieve the LoanApplicationService bean
        LoanApplicationService loanService = context.getBean("loanApplicationService", LoanApplicationService.class);

        // Use the service to process the loan application
        loanService.processLoanApplication();

        // Close the context (this will invoke the destroy method)
        ((ClassPathXmlApplicationContext) context).close();
    }
}

