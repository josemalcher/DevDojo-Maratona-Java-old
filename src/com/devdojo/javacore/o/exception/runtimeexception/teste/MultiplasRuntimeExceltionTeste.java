package com.devdojo.javacore.o.exception.runtimeexception.teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceltionTeste {
    public static void main(String[] args) {

        try {
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("final do programa");

        try {
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}