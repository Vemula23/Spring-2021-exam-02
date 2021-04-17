/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question06;

import java.util.Scanner;

/**
 *
 * @author S542404
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.println("Answer for Question 6 : Venkatesh Vemula");
        System.out.print("Enter side1 : ");
        double side1 = scan.nextDouble();
        System.out.print("Enter side2 : ");
        double side2 = scan.nextDouble();
        System.out.print("Enter side3 : ");
        double side3 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter color : ");
        String Cr = scan.nextLine();
        System.out.print("Is triangle filled with color?" + " (True or False): ");
        boolean isFilled = scan.nextBoolean();
        Triangle Tr = new Triangle(isFilled, Cr, side1, side2, side3);
        System.out.println(Tr.toString());
    }
}
