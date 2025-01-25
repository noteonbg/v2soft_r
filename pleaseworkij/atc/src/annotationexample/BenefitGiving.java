package annotationexample;

import java.lang.invoke.LambdaConversionException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Person X
public class BenefitGiving {

    public static void main(String[] args) {

        Class c = UseAnnotation.class;
        try {
            Method m  = c.getMethod("travel");
            if(m.isAnnotationPresent(Amubalance.class))
            {
                System.out.println("give way");
                m.invoke(null);
                System.out.println("ok ambulance moved");


            }
            else
                m.invoke(null);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
