package com.devdojo.javacore.s.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum...";
        StringBuffer sb = new StringBuffer(16);
//        sb.append("Uma Frase comum 2 - ");
//        sb.append(" teste");
//        System.out.println(sb.reverse());
        sb.append("0123456789");
        //System.out.println(sb.delete(0,2));
        System.out.println(sb.insert(2, "###"));
    }
}
