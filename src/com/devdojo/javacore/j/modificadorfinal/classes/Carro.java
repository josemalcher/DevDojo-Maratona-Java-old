package com.devdojo.javacore.j.modificadorfinal.classes;

public class Carro {
    private String nome;
    private String marca;
    private static final double VELOCIDADE_FINAL  = 200;
    private final Comprador comprador = new Comprador();

/*    static {
        VELOCIDADE_FINAL = 200;
    }*/

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return comprador;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
