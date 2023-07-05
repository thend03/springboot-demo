package com.fc.springboot.dubbo.consumer;

import com.fc.springboot.facade.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * task
 *
 * @author since
 * @date 2023-06-01 18:16
 */
@Component
public class Task implements CommandLineRunner {
    @DubboReference
    private HelloService helloService;
    @Override
    public void run(String... args) throws Exception {
        String result = helloService.sayHello("world");
        System.out.println("Receive result ======> " + result);

        new Thread(()-> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println(new Date() + " Receive result ======> " + helloService.sayHello("world"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
