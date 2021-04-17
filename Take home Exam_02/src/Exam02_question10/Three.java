/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question10;

/**
 *
 * @author S542404
 */
public class Three extends Two {

    @Override
    public int apply(int x) {
        System.out.println("Three apply " + x);
        return -10;
    }

}
