package com.solleti;

public class Student {
    String name;
    College c1 = new College("VelTech");
    Address ad1 = new Address("1301 valley ","Newark","DE", 19702L);

    Student(String name) {
        this.name = name;
    }
}
