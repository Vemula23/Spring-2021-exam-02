/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question06;

/**
 *
 * @author S542404
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(boolean isFilled, String color, double side1,
            double side2, double side3) {
        super(isFilled, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return ((this.side1 + this.side2 + this.side3) / 2);

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getArea() {
        double v = this.getPerimeter();
        return (Math.sqrt((v - this.side1) * (v - this.side2) * (v - this.side3) * v));
    }

    @Override
    public String toString() {
        return "Area: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter()
                + "\nColor:" + this.getColor()
                + "\nFilled: " + this.isIsFilled();
    }
}
