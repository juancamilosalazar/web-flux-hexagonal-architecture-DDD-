package com.example.reactive.reactive.domain.model;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
