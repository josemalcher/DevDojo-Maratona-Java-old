package com.devdojo.javacore.o.exception.checkedexception.classes;

public class Leitor2 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Fechando o LEITOR 2");
    }
}
