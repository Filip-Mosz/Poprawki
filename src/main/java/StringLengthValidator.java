import java.lang.reflect.Field;

public class StringLengthValidator {
    public static boolean validate(Object o) throws IllegalAccessError, IllegalAccessException {
        Field[] fields = o.getClass().getDeclaredFields();

        for (Field field : fields) {
            MaxLength annotation = field.getAnnotation(MaxLength.class);
            if (annotation != null){
                field.setAccessible(true);
                String surname = (String) field.get(o);
                int surnameLenght = surname.length();
                if (surnameLenght < annotation.minValue()
                        || surnameLenght > annotation.maxValue()){
                    field.setAccessible(false);
                    return false;
                }
                field.setAccessible(false);
            }
        }

        return true; //tu było false :|
    }
}
