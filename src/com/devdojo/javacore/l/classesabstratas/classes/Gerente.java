package com.devdojo.javacore.l.classesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void imprime() {
        System.out.println("Dentro do imprime de GERENTE");
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.3);
    }
}
