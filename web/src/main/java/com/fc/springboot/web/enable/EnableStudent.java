package com.fc.springboot.web.enable;

import com.fc.springboot.web.model.Student;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * enable student,直接import普通的java class,注入bean
 *
 * @author since
 * @date 2023-05-25 15:54
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(Student.class)
public @interface EnableStudent {
}