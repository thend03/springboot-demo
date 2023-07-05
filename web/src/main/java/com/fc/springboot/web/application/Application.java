package com.fc.springboot.web.application;

import com.fc.springboot.web.enable.EnableMyConfiguration;
import com.fc.springboot.web.enable.EnableSelector;
import com.fc.springboot.web.enable.EnableStudent;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * app
 *
 * @author since
 * @date 2022-09-28 19:11
 */
@EnableSelector
    @EnableMyConfiguration
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        dumpBeansToConsole(applicationContext);
    }

    /**
     * 往控制台上输出容器中注册的各个bean的名称
     *
     * @param applicationContext application context
     */
    private static void dumpBeansToConsole(ConfigurableApplicationContext applicationContext) {
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            Object bean = applicationContext.getBean(name);
            System.out.printf("%s[%s]\n", name, bean.getClass().getName());
        }
    }
}
