/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question09;

/**
 *
 * @author S542404
 */
public class VehiclesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycles b = new Bicycles();
        b.GearNo(4);
        b.IncreaseSpeed(45);
        b.applyBrakes(2);

        System.out.println("Answer for question 9 :");
        System.out.print("Bicycle present condition : ");
        b.printStates();

        Bikes Bi = new Bikes();
        Bi.GearNo(3);
        Bi.IncreaseSpeed(20);
        Bi.applyBrakes(1);

        System.out.print("Bike present condition : ");
        Bi.printStates();
    }
}
