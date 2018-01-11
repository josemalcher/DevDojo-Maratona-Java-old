package com.devdojo.javacore.z.colecoes.teste;

import com.devdojo.javacore.z.colecoes.classes.Celular;

public class EqualsTeste {
    public static void main(String[] args) {
        String nome1 = "José";
        String nome2 = new String("José");
        Integer int1 = 5;
        Integer int2 = new Integer(5);

        //System.out.println(nome1.equals(nome2));
        //System.out.println(int1.equals(int2));

        Celular c1  = new Celular("iPhone", "123456");
        Celular c2  = new Celular("iPhone", "1234562");
        System.out.println(c1.equals(c2));
    }
}
