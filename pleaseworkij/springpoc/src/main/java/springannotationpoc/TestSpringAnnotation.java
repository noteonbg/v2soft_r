package springannotationpoc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;



public class TestSpringAnnotation {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(Freak.class);
        X temp = ac.getBean(X.class) ;// to write this we should be conscious about which objects spring has got.







    }
}
