package com.devdojo.javacore.k.enumeracao.teste;

        import com.devdojo.javacore.k.enumeracao.classes.Cliente;
        import com.devdojo.javacore.k.enumeracao.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(Cliente.TipoPagamento.AVISTA,"JOSE JR.", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);
    }
}
