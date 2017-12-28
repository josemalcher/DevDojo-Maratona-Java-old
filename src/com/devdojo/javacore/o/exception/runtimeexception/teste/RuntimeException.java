package com.devdojo.javacore.o.exception.runtimeexception.teste;

public class RuntimeException {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch (java.lang.RuntimeException e){
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }

    public static void divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Valor precisa ser diferente de ZERO");
        }
        int result = a/b;
        System.out.println(result);
    }
}
