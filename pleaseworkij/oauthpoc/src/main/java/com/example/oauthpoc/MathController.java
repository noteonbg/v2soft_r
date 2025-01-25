package com.example.oauthpoc;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    // Only accessible to authenticated users
    //@PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/add")
    public int add(@RequestParam int num1, @RequestParam int num2) {
        return num1 + num2;
    }

    // Only accessible to authenticated users
    //@PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/subtract")
    public int subtract(@RequestParam int num1, @RequestParam int num2) {
        return num1 - num2;
    }
}
