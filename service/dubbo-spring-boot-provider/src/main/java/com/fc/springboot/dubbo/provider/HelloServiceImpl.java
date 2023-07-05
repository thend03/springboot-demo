package com.fc.springboot.dubbo.provider;

import com.fc.springboot.facade.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * hello service  impl
 *
 * @author since
 * @date 2023-06-01 18:01
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "say hello to " + name;
    }
}
