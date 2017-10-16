package com.devdojo.javacore.b.introducaometodos.test;

import com.devdojo.javacore.b.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Continuando a exec....");
    }
}
