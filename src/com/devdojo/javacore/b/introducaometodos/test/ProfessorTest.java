package com.devdojo.javacore.b.introducaometodos.test;

import com.devdojo.javacore.b.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "122.222.232-20";
        prof.matricula = "11122";
        prof.nome = "Marcos";
        prof.rg = "122211-5";

        Professor prof2 = new Professor();
        prof2.cpf = "222.111.888-20";
        prof2.matricula = "44444";
        prof2.nome = "Joana";
        prof2.rg = "2122-6";

        prof.imprime(prof);
        prof.imprime(prof2); // algo aqui errado que parece não está certo!!
    }
}
