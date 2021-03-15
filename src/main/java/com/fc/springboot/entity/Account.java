package com.fc.springboot.entity;

import java.io.Serializable;

/**
 * account entity
 *
 * @author since
 * @date 2021-03-09 16:54
 */
public class Account implements Serializable {

    private static final long serialVersionUID = 4897466928354927836L;

    private int id;
    private String name;

    public Account(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
