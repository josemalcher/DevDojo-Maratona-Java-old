package com.devdojo.javacore.h.heranca.classes;

public class Funcionario extends Pessoa{
    private double salario;
    {
        System.out.println("Blcoo de Inicialização de funcionario 1");
    }
    {
        System.out.println("Blcoo de Inicialização de funcionario 2");
    }
    static {
        System.out.println("BLCOO DE INICIALIZAÇÂO ESTATICO FUNCIONARIO 1");
    }


    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario = " + this.salario);
        imprimeReciboPagamento();
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("DENTRO DO CONSTRUTOR DE FUNCIONARIO");
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + " RECEBI R$ "+this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
