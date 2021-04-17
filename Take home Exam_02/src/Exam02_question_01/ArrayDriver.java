/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S542404
 */
public class ArrayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question1  1: Venkatesh Vemula");
        ArrayList<Integer> vem = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            vem.add(scan.nextInt());
        }
        removeDuplicate(vem);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> array = new ArrayList<>();
        for (Integer v : list) {
            if (!array.contains(v)) {
                array.add(v);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
