package com.fc.springboot.web.configuration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * dynamic import selector
 *
 * @author since
 * @date 2023-05-25 16:39
 */
public class DynamicImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[0];
    }
}
