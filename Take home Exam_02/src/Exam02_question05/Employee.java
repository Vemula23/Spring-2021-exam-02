/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question05;

import java.util.Date;

/**
 *
 * @author S542404
 */
public class Employee extends Person {

    private String office;
    private String salary;
    private Date dateHired;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String address, String phoneNumber,
            String email, String office, String salary, Date dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Name of Employee: " + super.getName();
    }
}
