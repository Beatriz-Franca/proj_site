package com.liorspencer.projex;

public class Trapezio {
    private double baseMenor;
    private double baseMaior;
    private double altura;
    //construtor


    public Trapezio(double baseMenor, double baseMaior, double altura) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }
    public double calcularArea(){
        return (baseMenor + baseMaior)*altura/2;
    }
}
