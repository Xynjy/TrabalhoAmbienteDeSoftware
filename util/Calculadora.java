package util;

import java.lang.Math;

public class Calculadora {
    public double soma(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }

    public double subtracao(double numeroA, double numeroB) {
        return numeroA - numeroB;
    }

    public double divisao(double numeroA, double numeroB) {
        return numeroA / numeroB;
    }

    public double multiplicacao(double numeroA, double numeroB) {
        return numeroA * numeroB;
    }
    public double sqrt(double numeroA) {
        return Math.sqrt(numeroA);
    }
    public double expo(double numeroA, double numeroB) {
        return Math.pow(numeroA, numeroB);
    }
    public double tetopiso(double numeroA) {
        return Math.round(numeroA);
    }
}