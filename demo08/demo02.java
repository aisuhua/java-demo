import java.lang.reflect.Field;

public class demo {
    public static void main(String[] args) {
        Person person = new Person();

    }
}

class Person {
    @Range(min=1, max=20)
    public String name;
    @Range(min=10)
    public String city;

    public void check() {
        for (Field field : this.getClass().getFields()) {
            
            if (field.getType() == String.class) {

            }
        }
    }
}

public @interface Range {
    int min() default 0;
    int max() default 255;
}