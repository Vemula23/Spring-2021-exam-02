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
public abstract class Bottle {

    private String price;
    private String color;
    private double size;

    public Bottle(String price, String color, double size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public abstract void weightOfBottle();

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }
}
