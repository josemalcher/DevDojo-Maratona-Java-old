package com.devdojo.javacore.d.obrecargaconstrutores.test;

import com.devdojo.javacore.d.obrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12212","Carlitos", new double[]{5,7,9},"13/04/2016");
        est.imprime();
    }
}
