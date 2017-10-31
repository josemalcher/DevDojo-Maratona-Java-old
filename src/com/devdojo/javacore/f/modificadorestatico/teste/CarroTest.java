package com.devdojo.javacore.f.modificadorestatico.teste;

import com.devdojo.javacore.f.modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {

        //Carro.velocidadeLimite = 320;
        Carro.setVelocidadeLimite(320);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);
        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("#######################");


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
