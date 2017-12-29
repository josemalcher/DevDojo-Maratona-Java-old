package com.devdojo.javacore.o.exception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        abrindoArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo Criado? " + file.createNewFile());
            System.out.println("Arquivo criado com sucesso!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String abrindoArquivo() {
        try {
            System.out.println("Abrindo ARQUIVO!!");
            System.out.println("Executando A LEITURA");
            //throw new Exception();
            System.out.println("Escrevendo no arquivo");
            return "valor";
        } catch (Exception e) {
            System.out.println("Dentro do CATCH");
            e.printStackTrace();
        } finally { //sempre executado
            System.out.println("FECHANDO ARQUIVO");
        }
        return null;
    }

}
