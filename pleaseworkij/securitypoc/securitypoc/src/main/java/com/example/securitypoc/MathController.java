package com.example.securitypoc;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    // This method requires authentication for adding two numbers
    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    // This method does not require authentication for subtracting two numbers
    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }
}

