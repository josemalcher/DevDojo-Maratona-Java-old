package com.devdojo.javacore.o.exception.runtimeexception.teste;

public class RuntimeException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if(b != 0){ // "Tratamento"
            int c = a/b;
            System.out.println(c);
        }


        Object obj = null;
        //System.out.println(obj.toString()); //NullPointerException

        try{
            int[] ar = new int[2];
            System.out.println(ar[2]); //ArrayIndexOutOfBoundsException
            System.out.println("Imprimindo depois da possivel excecao");
        }catch (java.lang.RuntimeException e ){
            e.printStackTrace();
        }


    }
}
