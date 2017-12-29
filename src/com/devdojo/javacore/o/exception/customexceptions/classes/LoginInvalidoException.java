package com.devdojo.javacore.o.exception.customexceptions.classes;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("--->>> Usuario ou senha inválidos!! <<<---");
    }

}
