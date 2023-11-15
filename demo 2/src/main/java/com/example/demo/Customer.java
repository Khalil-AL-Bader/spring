package com.example.demo;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Customer {
    private String name;
    private Address address;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
