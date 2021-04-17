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
public enum SandwichName {

    VEGGIE_DELIGHT(5.49, 3.99, 5.78),
    OVEN_ROASTED_CHICKEN(7.49, 5.29, 7.78),
    TURKEY_BREAST(7.49, 5.29, 7.78);

    private final double footLongPrice;
    private final double sixInchPrice;
    private final double saladPrice;

    private SandwichName(double footLongPrice, double sixInchPrice, double saladPrice) {
        this.footLongPrice = footLongPrice;
        this.sixInchPrice = sixInchPrice;
        this.saladPrice = saladPrice;
    }

    public static SandwichName getVEGGIE_DELIGHT() {
        return VEGGIE_DELIGHT;
    }

    public static SandwichName getOVEN_ROASTED_CHICKEN() {
        return OVEN_ROASTED_CHICKEN;
    }

    public static SandwichName getTURKEY_BREAST() {
        return TURKEY_BREAST;
    }

    public double getFootLongPrice() {
        return footLongPrice;
    }

    public double getSixInchPrice() {
        return sixInchPrice;
    }

    public double getSaladPrice() {
        return saladPrice;
    }
}
