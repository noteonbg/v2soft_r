package demo.poc.springbootexample;

import org.springframework.stereotype.Component;

@Component
public class B {

    public B()
    {
        System.out.println("B object created");

    }

    public void bFunction()
    {
        System.out.println("B function");
    }
}
