package com.fc.springboot.web.configuration;

import com.fc.springboot.web.model.Teacher;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


/**
 * my selector,导入selector的类
 *
 * @author since
 * @date 2023-05-25 16:35
 */
public class MySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Teacher.class.getName()};
    }

}
