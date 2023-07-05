package com.fc.springboot.web.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * enable registar
 *
 * @author since
 * @date 2023-05-25 16:41
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableRegister {
}