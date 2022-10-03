package com.hillel.pontenko.homeworks.homework3.entity;

import java.util.Objects;

public class Support extends User {


    public Support(String firstName, String lastName, String email, String password, String gender, String country) {
        super(firstName, lastName, email, password, gender, country);
    }


    public void read() {

        System.out.println("support data:" + this);
    }


    @Override
    public void write(String supportString) {
        super.write(supportString);
    }


    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    String quatrain;
    String str1;

    public Support(String firstName, String lastName, String email, String password, String gender, String country, String quatrain, String str1) {
        super(firstName, lastName, email, password, gender, country);
        this.quatrain = quatrain;
        this.str1 = str1;
    }

    public String getQuatrain() {
        return quatrain;
    }

    public void setQuatrain(String quatrain) {
        this.quatrain = quatrain;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void stringValidation() {


    }
}
