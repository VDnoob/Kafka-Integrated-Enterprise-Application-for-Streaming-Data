package com.example.SpringBatch.SpringBatch_Gamma.Model;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String firstname;
    private String lastname;

    public Person(){

    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
