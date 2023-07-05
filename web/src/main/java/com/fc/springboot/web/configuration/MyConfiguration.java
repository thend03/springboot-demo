package com.fc.springboot.web.configuration;

import com.fc.springboot.web.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * my configuration
 *
 * @author since
 * @date 2023-05-25 15:37
 */
@Slf4j
@Configuration
public class MyConfiguration {
    @Bean
    public Student student() {
        System.out.println("初始化student");
        return new Student();
    }
}
