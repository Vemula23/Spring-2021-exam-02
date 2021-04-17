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
public class BikesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TwoWheelerBikes bike = new YamahaFuelBike(110, "SingleCyclinder", "Yamaha", "YBR110", 2012);
        System.out.println(bike.toString());
    }

}
