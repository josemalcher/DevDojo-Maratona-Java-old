package com.devdojo.javacore.k.enumeracao.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),PESSOA_JURIDICA(2,"Pessoa Juridica");

    private int tipo;
    private String nome;
    TipoCliente(int tipo, String nome) { //sempre é private
        this.tipo = tipo;
        this.nome = nome;
    }
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
