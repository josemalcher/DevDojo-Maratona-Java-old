package com.devdojo.introducao;

/**
 * Criado por José Stélio Malcher Jr. on 15/09/2017.
 */
public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero1+numero2);
        System.out.println("A Soma é" + numero1+numero2);
        System.out.println(numero1+numero2 + "   SOMANDO...   " + numero1 + numero2);
        System.out.println(numero1+numero2 + "   SOMANDO...   " + (numero1 + numero2));

        // Aula 07
        int numeroInteiro = 20;
        long numeroLong = 200000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        numeroFloat = (float) numeroDouble;

        int resto = 20 % 2;
        System.out.println("Resto é " + resto);
        System.out.println(numeroDouble);

    }
}
