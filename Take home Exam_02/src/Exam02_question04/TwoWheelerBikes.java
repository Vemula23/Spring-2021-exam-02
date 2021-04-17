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
public class TwoWheelerBikes {

    private String name;
    private String modelName;
    private int year;

    public TwoWheelerBikes(String name, String modelName, int year) {
        this.name = name;
        this.modelName = modelName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "TwoWheelerBikes{" + "name=" + name + ", modelName=" + modelName + ", year=" + year + '}';
    }

}
