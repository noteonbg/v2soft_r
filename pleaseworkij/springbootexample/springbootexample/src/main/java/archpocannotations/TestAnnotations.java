package archpocannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("archpocannotations")
public class TestAnnotations {

    public static void main(String[] args) {

        ApplicationContext ac =new AnnotationConfigApplicationContext(TestAnnotations.class);

        Presentation pc = ac.getBean(Presentation.class);
        pc.startTheApp();

        //DAOLayer dc =ac.getBean(DAOLayer.class);

     //   Courier c =new Courier();

        //dc.talkwithDB(c);

        /*
        ServiceLogic s  = ac.getBean(ServiceLogic.class);
        String y = s.someServiceFunction(c);
        System.out.println(y);

        */






    }
}
