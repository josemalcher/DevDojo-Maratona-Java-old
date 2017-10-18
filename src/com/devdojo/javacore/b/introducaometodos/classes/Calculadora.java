package com.devdojo.javacore.b.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(double num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; //funciona como um break
        }
        System.out.println("Não é possivel dividir por 0 ");
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 30;
        b = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: " + a);
        System.out.println("num2: " + b);
    }


    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //public void somaVarArgs(double numero1, int... numeros) //precisa sempre ser o último
    public void somaVarArgs(int... numeros) { //apenas um por assinatura de método!
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
