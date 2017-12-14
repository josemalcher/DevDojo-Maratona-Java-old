package com.devdojo.javacore.l.classesabstratas.testes;

import com.devdojo.javacore.l.classesabstratas.classes.Gerente;
import com.devdojo.javacore.l.classesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {

        //Funcionario f = new Funcionario("JOSE", "123-22", 2000);
        Gerente g = new Gerente("JULIANA", "4444-33", 2000);
        Vendedor v = new Vendedor("JOSE", "123-22", 2000, 1000);
        //f.calculaSalario();
        g.calculaSalario();
        v.calculaSalario();
        //System.out.println(f);
        System.out.println(g);
        System.out.println(v);

    }
}
