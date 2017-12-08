package com.devdojo.javacore.j.modificadorfinal.teste;

import com.devdojo.javacore.j.modificadorfinal.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();
        Carro.getVelocidadeFinal();

        System.out.println(c.getComprador());
        c.getComprador().setNome("COMPRADOR NOME MARIA");
        System.out.println(c.getComprador());
    }
}
