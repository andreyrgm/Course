package co.argm.app.model;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface JsonAttribute {
    String name() default "";
    boolean capitalize() default false;
}
