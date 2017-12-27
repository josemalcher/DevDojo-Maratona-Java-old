package com.devdojo.javacore.n.polimorfismo.testes;

import com.devdojo.javacore.n.polimorfismo.classes.ArquivoDAOImpl;
import com.devdojo.javacore.n.polimorfismo.classes.DataBaseDAOImpl;
import com.devdojo.javacore.n.polimorfismo.classes.GenercDAO;

public class DAOTeste {
    public static void main(String[] args) {

        //GenercDAO dadoParaSalvar = new ArquivoDAOImpl();
        GenercDAO dadoParaSalvar = new DataBaseDAOImpl();

        dadoParaSalvar.save();

    }
}
