package com.hillel.pontenko.homeworks.homework3.entity;

public class Admin extends User{
    public Admin(String firstName, String lastName, String email, String password, String gender, String country) {
        super(firstName, lastName, email, password, gender, country);
    }
    public void read() {

        System.out.println("admin data:" + this );
    }

    @Override
    public void write(String adminString) {
        super.write(adminString);
    }
}
