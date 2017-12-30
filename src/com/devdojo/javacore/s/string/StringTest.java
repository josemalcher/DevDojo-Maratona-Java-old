package com.devdojo.javacore.s.string;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Jose";
        nome = nome.concat(" Malcher"); // nome += " Suane";
        String nome2 = "William";
        String nome3 = new String("Catarina");
        // 1 - variavel de referencia,
        // 2 - um objeto do tipo string,
        // 3 - Uma string no pool de String

        System.out.println(nome3);

    }
}
