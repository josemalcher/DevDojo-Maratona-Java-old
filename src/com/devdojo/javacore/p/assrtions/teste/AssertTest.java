package com.devdojo.javacore.p.assrtions.teste;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-10000);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0) : "Não pode ser menor que ZERO!!" + salario;
        // em config VM -> -ea //habilita
        // em config VM -> -ea:com.devdojo.javacore.p.assrtions.teste.AssertTest //habilita para a classe
        // em config VM -> -ea -da:com.devdojo.javacore.p.assrtions.teste.AssertTest //desabilita para a classe
        // em config VM -> -da //desabilita
    }

    public static void calcSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void diasDaSemana(int dia) {
        switch (dia) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                assert false;
        }
    }
}
