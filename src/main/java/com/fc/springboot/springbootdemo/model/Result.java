package com.fc.springboot.springbootdemo.model;

import java.util.List;

/**
 * @author feng.chuang
 * @description result
 * @time 2020-12-31 16:56
 */
public class Result {
    private int id;
    private String name;
    private String info;
    private String type;
    private Cherry cherry;
    private List<Snow> snows;
    private List<String> strings;

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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cherry getCherry() {
        return cherry;
    }

    public void setCherry(Cherry cherry) {
        this.cherry = cherry;
    }

    public List<Snow> getSnows() {
        return snows;
    }

    public void setSnows(List<Snow> snows) {
        this.snows = snows;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
