package com.devdojo.introducao;

public class ControleFluxo5 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas parcelas ele pode ser parcelado.
        //porém as parcelas não podem ser menores que 1000.

        double valorTotal = 30000;
        for(int parcela = 1 ; parcela <= valorTotal ; parcela++){
            double valorParcala = valorTotal/parcela;

            /*if(valorParcala >= 1000){
                System.out.println("Parcela "+ parcela + " R$ " + valorParcala);

            }else {
                System.out.println("Saindo do laço");
                break;
            }*/
            if(valorParcala < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcala);

        }
        System.out.println("FORA do laço!");


    }
}
