package com.devdojo.javacore.z.colecoes.teste;

import com.devdojo.javacore.z.colecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S2","123456");
        Celular celular2 = new Celular("Galaxy S7","123111");
        Celular celular3 = new Celular("Mogo G","123444");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList) {
            System.out.println(celular);
        }
        Celular celular4 = new Celular("Mogo Play 3","123000");
        System.out.println(celularList.contains(celular4)); //false
    }
}
