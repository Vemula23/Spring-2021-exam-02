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
public enum Veggies {
    JALAPENOS(2, 3.75),
    GREEN_PEPPERS(0.75, 1.69),
    LETTUCE(0.5, 2);

    private final double regularPrice;
    private final double extraPrice;

    private Veggies(double regularPrice, double extraPrice) {
        this.regularPrice = regularPrice;
        this.extraPrice = extraPrice;
    }

    public static Veggies getJALAPENOS() {
        return JALAPENOS;
    }

    public static Veggies getGREEN_PEPPERS() {
        return GREEN_PEPPERS;
    }

    public static Veggies getLETTUCE() {
        return LETTUCE;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getExtraPrice() {
        return extraPrice;
    }

}
