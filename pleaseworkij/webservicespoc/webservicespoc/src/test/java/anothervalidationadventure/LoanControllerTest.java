package anothervalidationadventure;





import com.fasterxml.jackson.databind.ObjectMapper;

import anothervalidationexample.Loan;
import anothervalidationexample.LoanController;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(LoanController.class)
public class LoanControllerTest {

    @Autowired
    private MockMvc mockMvc; // MockMvc for simulating HTTP requests

   // @Mock
    //private LoanService loanService; // Mocked service layer

    @InjectMocks
    private LoanController loanController; // Inject mocks into controller

    @Autowired
    private ObjectMapper objectMapper; // For serializing objects into JSON

    // A sample Loan object for testing
    private Loan validLoan;

    @BeforeEach
    public void setUp() {
        // Initialize mocks
        MockitoAnnotations.openMocks(this);

        // Create a sample loan for valid case
        validLoan = new Loan();
        validLoan.setLoanId(1);
        validLoan.setLoanName("Home Loan");
        validLoan.setTenure(5);
    }

    @Test
    public void testCreateLoan_ValidRequest() throws Exception {
        // Mock the service layer behavior
       // when(loanService.createLoan(validLoan)).thenReturn("Loan created successfully with ID: 1");

        // Send a POST request with a valid Loan object
        mockMvc.perform(post("/loan/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(validLoan)))
                .andExpect(status().isOk())  // Expect HTTP 200 OK
                .andExpect(content().string("Loan created successfully with ID: 1"));  // Expect correct response message
    }

    @Test
    public void testCreateLoan_InvalidRequest_InvalidTenure() throws Exception {
        // Create an invalid Loan object (invalid tenure)
        Loan invalidLoan = new Loan();
        invalidLoan.setLoanId(2);
        invalidLoan.setLoanName("Car Loan");
        invalidLoan.setTenure(0);  // Invalid tenure (less than 1)

        // Send a POST request with the invalid Loan object
        mockMvc.perform(post("/loan/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(invalidLoan)))
                .andExpect(status().isBadRequest())  // Expect HTTP 400 Bad Request
                .andExpect(content().string("Tenure must be at least 1 year"));  // Expect specific error message
    }

    @Test
    public void testCreateLoan_InvalidRequest_EmptyLoanName() throws Exception {
        // Create an invalid Loan object (empty loan name)
        Loan invalidLoan = new Loan();
        invalidLoan.setLoanId(3);
        invalidLoan.setLoanName("");  // Empty loan name
        invalidLoan.setTenure(5);

        // Send a POST request with the invalid Loan object
        mockMvc.perform(post("/loan/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(invalidLoan)))
                .andExpect(status().isBadRequest())  // Expect HTTP 400 Bad Request
                .andExpect(content().string("Loan Name must not be empty"));  // Expect specific error message
    }
}
