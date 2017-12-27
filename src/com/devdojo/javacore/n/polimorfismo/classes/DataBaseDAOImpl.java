package com.devdojo.javacore.n.polimorfismo.classes;

public class DataBaseDAOImpl implements GenercDAO{
    @Override
    public void save() {
        System.out.println("Salvando dados no BD");
    }
}
