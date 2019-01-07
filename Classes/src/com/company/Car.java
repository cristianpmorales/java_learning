package com.company;

public class Car {

    private String Make;
    private String model;
    public String engine;
    public String color;
    private int wheels;
    private int doors;

    public void setColor(String color){
        this.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getStuff (){
        return this.color;
        return this.model;
    }


}
