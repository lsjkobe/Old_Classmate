package com.leoli.old_classmate.entity;

import java.io.Serializable;

public class People implements Serializable, Cloneable {
    String name;
    int age;
    String sexy; //男 1， 女 0

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }
}
