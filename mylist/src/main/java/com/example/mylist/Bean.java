package com.example.mylist;

/**
 * Created by Lenovo Le on 2016/5/19.
 */
public class Bean {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String age;

    public Bean(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
