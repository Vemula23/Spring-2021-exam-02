/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_question09;

/**
 *
 * @author S542404
 */
public class Bicycles implements Vehicles {

    int currentSpeed;
    int gearNumber;

    @Override
    public void GearNo(int newGear) {
        gearNumber = newGear;
    }

    @Override
    public void IncreaseSpeed(int increment) {
        currentSpeed = currentSpeed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        currentSpeed = currentSpeed - decrement;
    }

    public void printStates() {
        System.out.println("currentSpeed: " + currentSpeed
                + " GearNumber: " + gearNumber);
    }
}
