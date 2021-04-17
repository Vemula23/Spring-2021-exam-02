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
public class Staff extends Employee {

    private String title;

    public Staff(String name) {

        super(name);
    }

    public Staff(String name, String title) {

        super(name);
        this.title = title;
    }

    public String toString() {

        return "Name of Staff: " + super.getName();
    }

}
