/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question08;

/**
 *
 * @author S542404
 */
public class BottleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for the question 8 : ");
      SteelBootle s = new SteelBootle("100", "Green", 1.5);
      s.weightOfBottle();
      System.out.println("*****************");
      s.values();
        System.out.println("*****************");
      s.price();
        System.out.println("*******************");
      s.size();
       
    }
    
}
