package com.devdojo.javacore.o.exception.checkedexception.classes;

public class Leitor1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("FECHANDO O LEITOR 1");
    }
}
