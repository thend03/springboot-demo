package com.fc.springboot.model;

/**
 * @author feng.chuang
 * @description person info
 * @time 2021-01-04 15:49
 */
public class Person {
    private String name;
    private String ref;
    private int id;
    private User user;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
