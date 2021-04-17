/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question_03;

import java.util.ArrayList;
import java.util.Date;

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
        ArrayList<Object> v = new ArrayList<Object>();
        Loan l = new Loan("1000", "04/10/2021", 2);
        Circle c = new Circle(12.2);
        Date d = new Date();
        String s = "venkatesh";
        v.add(l);
        v.add(d);
        v.add(s);
        v.add(c);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i).toString());
        }

    }

}
