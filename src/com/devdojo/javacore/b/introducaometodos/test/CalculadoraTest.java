package com.devdojo.javacore.b.introducaometodos.test;

import com.devdojo.javacore.b.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        calculadora.multiplicaDoisNumeros(55.5,5);

        System.out.println("divisao de dois numeros");
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);

    }
}
