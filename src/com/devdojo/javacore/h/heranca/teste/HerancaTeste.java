package com.devdojo.javacore.h.heranca.teste;

import com.devdojo.javacore.h.heranca.classes.Endereco;
import com.devdojo.javacore.h.heranca.classes.Funcionario;
import com.devdojo.javacore.h.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("José Malcher Jr.");
        p.setCpf("123456789");
        Endereco end = new Endereco();
        end.setBairro("Cidade Velha");
        end.setRua("Rua Tal tal tal");
        p.setEndereco(end);
        p.imprime();
        System.out.println("------------------------------------");
        Funcionario f = new Funcionario("FUncionario 01");
        f.setCpf("987654321");
        f.setSalario(1500);
        f.setEndereco(end);
        f.imprime();
    }
}
