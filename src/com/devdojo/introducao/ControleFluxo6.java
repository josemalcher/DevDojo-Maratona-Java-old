package com.devdojo.introducao;

public class ControleFluxo6 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas parcelas ele pode ser parcelado.
        //porém as parcelas não podem ser menores que 1000.

         double valorTotal = 30000;
         for(int parcela = (int)valorTotal ; parcela >= 1 ; parcela--){
             double valorParcela = valorTotal / parcela;

             if(valorParcela <= 1000){
                 continue;
                 //códigos aqui... resultará em erro de compilação!
             }
             System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
             System.out.println("CODIGO CONSUMINDO MEMORIA!");
         }

    }
}
