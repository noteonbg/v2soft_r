package annotationexample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//creation of the annotation..


//Person X
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Amubalance {
}
