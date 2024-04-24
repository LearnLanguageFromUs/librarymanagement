package com.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    int age;
    int adharId;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", adharId=" + adharId +
                '}';
    }
}
