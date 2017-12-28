package com.devdojo.javacore.o.exception.error.teste;

public class ErrorTeste {
    public static void main(String[] args) {
        stackOverflowError();
    }
    public static void stackOverflowError(){
        stackOverflowError();
    }
}
