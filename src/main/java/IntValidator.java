import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value  = ElementType.FIELD) //na czym można używać
@Retention(value = RetentionPolicy.RUNTIME) //kiedy ma działać

public @interface IntValidator {
    int minValue();  //bardziej pole niż metoda
    int maxValue() default 10;
}
