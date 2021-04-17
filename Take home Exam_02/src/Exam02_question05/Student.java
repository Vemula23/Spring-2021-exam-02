/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question05;

/**
 *
 * @author S542404
 */
public class Student extends Person {

    private String grade;
    private static final String STATUS = "Graduate";

    public Student(String name) {
        super(name);
    }

    public Student(String name, String address,
            String phoneNumber, String email, String grade, String STATUS) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name of Student: " + super.getName();
    }
}
