package org.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        Helper helper = new Helper();

        helper.setName("Alok");
        helper.setAge(28);
        helper.setPsp(99.0);
        helper.setUniversityName("Thapar University");

        Student st = new Student(helper); // validations will happen inside this
    }
}
