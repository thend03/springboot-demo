package com.fc.springboot.web.enable;

import com.fc.springboot.web.configuration.MyConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * enable my configuration
 *
 * @author since
 * @date 2023-05-25 15:40
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyConfiguration.class)
public @interface EnableMyConfiguration {

}