package lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LoanApplicationService loanApplicationService() {
        LoanApplicationService service = new LoanApplicationService();
        service.setApplicantName("pqr");
        service.setLoanAmount(50000);
        return service;
    }
}
