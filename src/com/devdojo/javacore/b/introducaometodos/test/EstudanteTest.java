package com.devdojo.javacore.b.introducaometodos.test;

import com.devdojo.javacore.b.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "William Suane";
        estudante.idade = 18;
        //estudante.notas = new double[]{3, 2, 9.5};
        estudante.print();
        estudante.tirarMedia();

    }
}
