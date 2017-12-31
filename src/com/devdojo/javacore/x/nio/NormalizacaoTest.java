package com.devdojo.javacore.x.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {
    public static void main(String[] args) {

        String diretorioProjeto = "JavaOnline\\home\\william\\dev";
        String arquivoTxt = "..\\..\\arquivo.txt"; //voltar
        Path p1 = Paths.get(diretorioProjeto,arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());

        Path p2 = Paths.get("a/./b/./c"); // '/.' ref. ao mesmo diretorio
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
