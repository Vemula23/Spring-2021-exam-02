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
public class TeachingFaculty extends Instructor {

    private String mainSubject = "OOPS";
    private String secondSubject = "dataVisualization";

    public TeachingFaculty() {
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public String getSecondSubject() {
        return secondSubject;
    }

    public void setSecondSubject(String secondSubject) {
        this.secondSubject = secondSubject;
    }

    public void job() {
        System.out.println("Teaching");
    }
}
