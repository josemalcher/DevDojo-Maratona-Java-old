package com.devdojo.javacore.o.exception.customexceptions.teste;

import com.devdojo.javacore.o.exception.customexceptions.classes.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "goku";
        String senhaDigitada = "123";
        if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado!");
        }
    }

}
