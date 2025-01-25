package tolerateuncertainty;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPOC {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac =new ClassPathXmlApplicationContext("root.xml");

        //we should be conscious which object we have with us...
        //X object and Y object..

        X obj = ac.getBean(X.class);
        obj.logicfuction();





    }
}
