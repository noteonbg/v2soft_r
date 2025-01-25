package anothervalidationexample;



import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Loan {

    @NotNull(message = "Loan ID must not be null")
    private Integer loanId;

    @NotBlank(message = "Loan Name must not be empty")
    private String loanName;

    @NotNull(message="tenure must be given") 
    @Min(value = 1, message = "Tenure must be at least 1 year")
    private Integer tenure;

    // Getters and Setters
    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public Integer getTenure() {
        return tenure;
    }

    public void setTenure(Integer tenure) {
        this.tenure = tenure;
    }

	public Loan(@NotNull(message = "Loan ID must not be null") Integer loanId,
			@NotBlank(message = "Loan Name must not be empty") String loanName,
			@Min(value = 1, message = "Tenure must be at least 1 year") Integer tenure) {
		
		this.loanId = loanId;
		this.loanName = loanName;
		this.tenure = tenure;
	}

	public Loan() {
		// TODO Auto-generated constructor stub
	}
    
    
}
