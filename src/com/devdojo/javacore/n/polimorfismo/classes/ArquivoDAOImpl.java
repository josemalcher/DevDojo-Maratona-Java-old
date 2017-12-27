package com.devdojo.javacore.n.polimorfismo.classes;

public class ArquivoDAOImpl implements GenercDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
