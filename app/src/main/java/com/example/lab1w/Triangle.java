package com.example.lab1w;

public class Triangle {

    private double AB;
    private double BC;
    private double AC;

    public Triangle(double AB, double BC, double AC){
        this.AB = AB;
        this.BC = BC;
        this.AC = AC;
    }


    public double getAB() {
        return AB;
    }

    public void setAB(double AB) {
        this.AB = AB;
    }

    public double getBC() {
        return BC;
    }

    public void setBC(double BC) {
        this.BC = BC;
    }

    public double getAC() {
        return AC;
    }

    public void setAC(double AC) {
        this.AC = AC;
    }

    //Текстовое описание класса
    public String toString(){
        return "Треугольник со сторонами AB: " + getAB() + ", BC: " + getBC()+
                ", AC: " + getAC();
    }

}
