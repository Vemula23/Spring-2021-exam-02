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
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("Naveen Mukkapati");
        Student s = new Student("Ajay Manam");
        Employee e = new Employee("Purna Potla");
        Faculty f = new Faculty("Sai Potla");
        Staff sf = new Staff("Kiran Vemula");
        System.out.println("Answer for Question 5 : Venkatesh Vemula");
        System.out.println(p.toString());
        System.out.println("**************************");
        System.out.println(s.toString());
        System.out.println("**************************");
        System.out.println(e.toString());
        System.out.println("**************************");
        System.out.println(f.toString());
        System.out.println("**************************");
        System.out.println(sf.toString());
        System.out.println("**************************");
    }

}
