package demo.poc.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private B fate;//programmer is doing it and spring is notforcing this..

    public A()
    {
        System.out.println("A object created");
    }

    @Autowired
    public void freak(B temp)
    {
        fate =temp;
        // B is wired inside A.
        System.out.println("B dependancy injected inside A");

    }

    public void somefunctionofA()
    {

        System.out.println("some function of A");
        fate.bFunction();



    }

}
