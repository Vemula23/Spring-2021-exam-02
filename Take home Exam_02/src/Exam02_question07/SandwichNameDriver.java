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
public class SandwichNameDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question 07 : ");
        for (SandwichName vem : SandwichName.values()) {
            System.out.println(vem + " Pizza is of $" + vem.getFootLongPrice());
        }
        System.out.println("******************");
        for (SandwichName v : SandwichName.values()) {
            System.out.println(v + "  FootLongPrice :" + v.getFootLongPrice()
                    + "  SixInchPrice :" + v.getSixInchPrice() + "  Salad price :" + v.getSaladPrice());
        }

    }

}
