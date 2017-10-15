package com.devdojo.introducao;

/**
 * Criado por José Stélio Malcher Jr. on 21/09/2017.
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 5000f;

        System.out.println(idade >= 21 && salario >= 2000);
        System.out.println(idade <= 16 && salario <= 2000);
        // false
        // false

        System.out.println(idade >= 21 || salario >= 2000);
        System.out.println(idade <= 21 || salario >= 2000);
        // true
        // true
    }
}
