package com.devdojo.javacore.b.introducaometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
    }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media > 6) {
            System.out.println("\n A média é: " + media + " situação: aprovado");
        } else {
            System.out.println("\n A média é: " + media + " situação: reprovado");
        }
    }

}
