import java.lang.reflect.Field;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

public class demo {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Person person = new Person("abc", "12");
        person.check();
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Range {
    int min() default 0;
    int max() default 255;
}

class Person {
    @Range(min=1, max=20)
    public String name;
    @Range(min=10)
    public String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void check() throws IllegalArgumentException, IllegalAccessException {
        for (Field field : this.getClass().getFields()) {
            System.out.println(field.getName());
            Range range = field.getAnnotation(Range.class);
            System.out.println(range);

            if (range == null) {
                continue;
            }

            if (field.getType() != String.class) {
                continue;
            }

            Object value = field.get(this);
            if (!(value instanceof String)) {
                continue;
            }
            
            String str = (String) value;
            if (str.length() < range.min() || str.length() > range.max()) {
                throw new IllegalArgumentException("Invalid field: " + field.getName());
            }
        }
    }
}