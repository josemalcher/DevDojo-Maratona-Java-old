package com.devdojo.javacore.n.polimorfismo.classes;

public class RelatorioPagamento {
/*

    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("Gerando relatorio de pagamento para o Gerente");
        gerente.calcularPagamento();
        System.out.println("Nome " + gerente.getNome());
        System.out.println("Salario do Mes " + gerente.getSalario());
    }
    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("Gerando relatorio de pagamento para o vendedores");
        vendedor.calcularPagamento();
        System.out.println("Nome " + vendedor.getNome());
        System.out.println("Salario do Mes " + vendedor.getSalario());
    }
*/

    public void relatorioPagamento(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome " + funcionario.getNome());
        System.out.println("Salario do Mes " + funcionario.getSalario());
    }

}
