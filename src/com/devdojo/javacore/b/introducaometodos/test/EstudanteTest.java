package com.devdojo.javacore.b.introducaometodos.test;

import com.devdojo.javacore.b.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.setNome("William Suane");
        estudante.setIdade(18);
        estudante.setNotas(new double[]{3, 2, 9.5});
        estudante.print();
        estudante.tirarMedia();

        System.out.println(estudante.getNome());
        System.out.println("Aluno Aprovado? "+ estudante.isAprovado() );

    }
}
