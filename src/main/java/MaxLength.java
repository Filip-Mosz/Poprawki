import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value  = ElementType.FIELD) //na czym można używać
@Retention(value = RetentionPolicy.RUNTIME) //kiedy ma działać
public @interface MaxLength {
    int minValue() default 2;
    int maxValue() default 20;
}
