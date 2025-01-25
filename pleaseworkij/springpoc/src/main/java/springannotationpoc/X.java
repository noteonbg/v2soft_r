package springannotationpoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//X depends on Y for the funtion f1.
@Component
public class X {


    private Y fate;

    public X( )  // constructor injection
    {
        System.out.println("X object created");

    }

    @Autowired
    public void junk(String s)
    {
        System.out.println("junk funtion called");


    }


    @Autowired
    public void setScrap( Y temp)  // Dependancy injection
    {



        System.out.println("Y wired in X thru setScrap");
        fate = temp; // this is fate becuase our project needs like this and spring is not forcing us this
    }

    public void logicfuction()
    {
        fate.someFunctionofY();


    }
}
