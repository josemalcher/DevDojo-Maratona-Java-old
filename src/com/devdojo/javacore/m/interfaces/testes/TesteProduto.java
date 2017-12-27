package com.devdojo.javacore.m.interfaces.testes;

import com.devdojo.javacore.m.interfaces.classes.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);
        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
