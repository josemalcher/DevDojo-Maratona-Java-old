package com.devdojo.javacore.n.polimorfismo.testes;

import com.devdojo.javacore.n.polimorfismo.classes.Funcionario;
import com.devdojo.javacore.n.polimorfismo.classes.Gerente;
import com.devdojo.javacore.n.polimorfismo.classes.RelatorioPagamento;
import com.devdojo.javacore.n.polimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Jose", 5000, 2000);
        Vendedor v = new Vendedor("Mariazinha", 2000, 20000);

        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        //relatorioPagamento.relatorioPagamentoGerente(g);
        //relatorioPagamento.relatorioPagamentoVendedor(v);
        relatorioPagamento.relatorioPagamento(g);
        relatorioPagamento.relatorioPagamento(v);

        System.out.println("------------------------------------");

        Funcionario f = g;
        System.out.println(f.getSalario());
    }
}
