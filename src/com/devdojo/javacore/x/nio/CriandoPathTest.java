package com.devdojo.javacore.x.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
    public static void main(String[] args) {
        // C:\Users\GCUIT\Google Drive\GCU\JavaOnline
        Path p1 = Paths.get("C:\\Users\\GCUIT\\Google Drive\\GCU\\JavaOnline\\Arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\GCUIT\\Google Drive\\GCU\\JavaOnline", "Arquivo.txt");
        Path p3 = Paths.get("C:", "Users\\GCUIT\\Google Drive\\GCU\\JavaOnline", "Arquivo.txt");
        Path p4 = Paths.get("C:", "Users", "GCUIT", "Google Drive", "GCU", "JavaOnline", "Arquivo.txt");

    }
}
