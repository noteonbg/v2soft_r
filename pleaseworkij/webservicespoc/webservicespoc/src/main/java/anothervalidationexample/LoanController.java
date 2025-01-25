package anothervalidationexample;




import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/loan")
public class LoanController {

	//security needed
    // Endpoint for creating a loan, with validation on the Loan object
    @PostMapping("/create")
    public String createLoan(@Valid @RequestBody Loan loan, BindingResult result) {
        if (result.hasErrors()) {
            return "Error: " + result.getAllErrors().get(0).getDefaultMessage();
        }
        // Here you would save the loan to the database
        return "Loan created successfully with ID: " + loan.getLoanId();
    }
    
    
    //security not needed
    @GetMapping("/getLoanInfo")
    public Loan getLoanInfo()
    {
    	return new Loan(1,"X",3);
    	
    }
    
    
}
