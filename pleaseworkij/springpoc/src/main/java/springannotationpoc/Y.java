package springannotationpoc;

import org.springframework.stereotype.Component;

@Component
public class Y {

    public Y()
    {
        System.out.println("Y object created");
    }

    public void someFunctionofY() {

        System.out.println("some function of Y");
    }
}
