package com.devdojo.javacore.e.blocodeinicializacao.test;

import com.devdojo.javacore.e.blocodeinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
