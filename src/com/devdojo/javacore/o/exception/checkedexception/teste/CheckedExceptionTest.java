package com.devdojo.javacore.o.exception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo(){
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo Criado? " + file.createNewFile());
            System.out.println("Arquivo criado com sucesso!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
