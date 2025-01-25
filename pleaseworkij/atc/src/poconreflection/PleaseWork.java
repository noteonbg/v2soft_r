package poconreflection;

import java.lang.reflect.Method;

//person Y code ..

//Y will be spring framework..

//this will be spring framework related code which we wont see in our project
public class PleaseWork {

    public static void main(String[] args) {

        System.out.println(1);

        // Y code wants ot know about something about the pencil.
        // Y code cannot see the pencil directly...

        // show pencil to a mirror.
         Class c = Pencil.class;

         //ask questions with the mirror.
        try {
            Method m = c.getDeclaredMethod("junk");
            System.out.println("do something with junk");

        } catch (NoSuchMethodException e) {
            System.out.println("junk is not presnet.");
            //throw new RuntimeException(e);
        }


    }
}
