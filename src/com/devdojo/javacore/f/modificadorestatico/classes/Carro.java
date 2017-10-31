package com.devdojo.javacore.f.modificadorestatico.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

 /*   public  double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public  void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }*/

    public void imprime(){
        System.out.println("--------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade maxima = " + this.velocidadeMaxima);
        System.out.println("Velocidade limite = " + velocidadeLimite);
    }
}
