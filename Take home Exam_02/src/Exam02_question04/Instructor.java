/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question04;

/**
 *
 * @author S542404
 */
public class Instructor {

    private String occupation = "Instructor";
    private String univerisityName = "Northwest";

    public Instructor() {
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getUniverisityName() {
        return univerisityName;
    }

    public void setUniverisityName(String univerisityName) {
        this.univerisityName = univerisityName;
    }

    public void work() {
        System.out.println("Instructing");
    }
}
