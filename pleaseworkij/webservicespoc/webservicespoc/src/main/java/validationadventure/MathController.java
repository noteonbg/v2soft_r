package validationadventure;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

     
    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        // Validate the inputs (in this case, no negative numbers allowed)
        if (a < 0 || b < 0) {
            throw new CustomException("Input values must be non-negative.");
        }
        return a + b;
    }

    
    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        // Validate the inputs (you can add other business rules here)
        if (a < 0 || b < 0) {
            throw new CustomException("Input values must be non-negative.");
        }
        return a - b;
    }
}
