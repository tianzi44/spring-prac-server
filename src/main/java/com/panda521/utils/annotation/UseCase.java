package com.panda521.utils.annotation;
import java.lang.annotation.*;


/**
 * Created by jack on 2019/2/11.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    public String name();

    public String description();
}