/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question07;

/**
 *
 * @author S542404
 */
public class VeggiesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question 07 : ");
        for (Veggies vem : Veggies.values()) {
            System.out.println(vem + " Pizza is of $" + vem.getRegularPrice());
        }
        System.out.println("******************");
        for (Veggies v : Veggies.values()) {
            System.out.println(v + "  RegularPrice :" + v.getRegularPrice()
                    + "  ExtraPrice :" + v.getExtraPrice());
        }

    }

}
