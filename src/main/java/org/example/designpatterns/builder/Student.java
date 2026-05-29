package org.example.designpatterns.builder;

import java.util.Map;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;
    Student(Helper helper) {
        // validations here
        if (helper.getGradYear() > 2026) {
            throw new IllegalArgumentException("Grad year cannot be > 2026");
        }

        // multiple validations here

        this.name = helper.getName();
        this.age = helper.getAge();
        this.batch = helper.getBatch();
        this.gradYear = helper.getGradYear();
        this.id = helper.getId();
        this.universityName = helper.getUniversityName();
        this.psp = helper.getPsp();
    }
}

// Flaws in the map approach
/*
map.put("psp", "hello") -> ClassCastException at runtime
map.put("nmae", "Alok") -> silently ignored, name is null
No compile time safety here -> Errors will only surface at run-time
*/
