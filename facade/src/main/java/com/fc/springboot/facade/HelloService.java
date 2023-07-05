package com.fc.springboot.facade;

/**
 * @author
 * @date 2023-06-01 17:59
 **/
public interface HelloService {
    /**
     * say hello to you
     *
     * @param name name
     * @return hello
     */
    String sayHello(String name);
}