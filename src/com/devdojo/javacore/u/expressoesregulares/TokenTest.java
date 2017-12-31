package com.devdojo.javacore.u.expressoesregulares;

public class TokenTest {
    public static void main(String[] args) {
        String str = "José Malcher4 William9 Paulo1 Joana2 Camila3 Anna4 John5 Matheus";
        String[] tokens = str.split("\\d"); // delimitador / regex
        for (String arr : tokens) {
            System.out.println(arr.trim());
        }
    }
}
