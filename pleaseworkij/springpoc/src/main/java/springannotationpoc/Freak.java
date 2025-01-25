package springannotationpoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("springannotationpoc,locationwherespringannotationsareused")
public class Freak {


@Bean
    //we have to give this object to spring becuase it is thing which is wiring
    public String  whocares()
    {
        return "Hi how are you"; // I will create the object hey spring you use it for you wiring.
    }

}
