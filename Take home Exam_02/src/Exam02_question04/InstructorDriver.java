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
public class InstructorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TeachingFaculty obj = new TeachingFaculty();
        System.out.println("Answer for question 4 : ");
        System.out.println("working in : " + obj.getUniverisityName());
        System.out.println("******************");
        System.out.println("working as : " + obj.getOccupation());
        System.out.println("******************");
        System.out.println("Main subject : " + obj.getMainSubject());
        System.out.println("******************");
        System.out.println("Second subject : " + obj.getSecondSubject());
        System.out.println("******************");
        obj.work();
        System.out.println("******************");
        obj.job();

    }

}
