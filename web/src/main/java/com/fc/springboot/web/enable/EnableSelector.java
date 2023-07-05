package com.fc.springboot.web.enable;

import com.fc.springboot.web.configuration.MySelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * enable selector,通过selector导入class，然后导入bean
 *
 * @author since
 * @date 2023-05-25 16:34
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MySelector.class)
public @interface EnableSelector {
}