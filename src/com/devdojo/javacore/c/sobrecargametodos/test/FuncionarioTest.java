package com.devdojo.javacore.c.sobrecargametodos.test;

import com.devdojo.javacore.c.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario = new Funcionario("Chica da Silva", "111.222.333-44", 4500, "122212-9");

        funcionario.imprime();
        funcionario2.imprime();


    }
}
