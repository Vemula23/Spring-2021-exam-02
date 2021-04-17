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
public class YamahaFuelBike extends TwoWheelerBikes {

    private int cubicCapacity;
    private String engineType;

    public YamahaFuelBike(int cubicCapacity, String engineType, String name, String modelName, int year) {
        super(name, modelName, year);
        this.cubicCapacity = cubicCapacity;
        this.engineType = engineType;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nYamahaFuelBike{" + "cubicCapacity=" + cubicCapacity + ", engineType=" + engineType + '}';
    }

}
