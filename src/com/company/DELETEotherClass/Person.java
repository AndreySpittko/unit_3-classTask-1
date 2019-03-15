package com.company.DELETEotherClass;

public abstract class Person {

    private String name;

    // Constructors

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
