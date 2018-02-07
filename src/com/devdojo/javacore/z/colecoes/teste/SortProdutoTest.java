package com.devdojo.javacore.z.colecoes.teste;

import com.devdojo.javacore.z.colecoes.classes.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto[] produtoArray = new Produto[4];

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        //Collections.sort(produtos);
        /*
            Produto{serialNumber='321', nome='Picanha', preco=26.4, quantidade=0}
            Produto{serialNumber='879', nome='Teclado Razer', preco=1000.0, quantidade=0}
            Produto{serialNumber='123', nome='Laptop Lenovo', preco=2000.0, quantidade=0}
            Produto{serialNumber='012', nome='Samsung galaxy S7 64Gb', preco=3250.5, quantidade=0}
         */
        Collections.sort(produtos, new ProdutoNomeComparator());
        /*
            Produto{serialNumber='123', nome='Laptop Lenovo', preco=2000.0, quantidade=0}
            Produto{serialNumber='321', nome='Picanha', preco=26.4, quantidade=0}
            Produto{serialNumber='012', nome='Samsung galaxy S7 64Gb', preco=3250.5, quantidade=0}
            Produto{serialNumber='879', nome='Teclado Razer', preco=1000.0, quantidade=0}
         */
        /*for (Produto produto : produtos) {
            System.out.println(produto);
        }*/
        produtoArray[0] = produto1;
        produtoArray[1] = produto2;
        produtoArray[2] = produto3;
        produtoArray[3] = produto4;

        Arrays.sort(produtoArray, new ProdutoNomeComparator());
        for (Produto produto : produtoArray) {
            System.out.println(produto);
        }


    }
}
