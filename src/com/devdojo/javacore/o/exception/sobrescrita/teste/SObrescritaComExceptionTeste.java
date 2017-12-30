package com.devdojo.javacore.o.exception.sobrescrita.teste;

import com.devdojo.javacore.o.exception.customexceptions.classes.LoginInvalidoException;
import com.devdojo.javacore.o.exception.sobrescrita.classes.Funcionario;
import com.devdojo.javacore.o.exception.sobrescrita.classes.Pessoa;

import java.io.FileNotFoundException;

public class SObrescritaComExceptionTeste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        try {
            p.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
