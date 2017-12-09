package com.devdojo.javacore.k.enumeracao.classes;

public class Cliente {

    public enum TipoPagamento{
        AVISTA, APRAZO
    }
    private TipoPagamento tipoPagamento;
    private String nome;
    private TipoCliente tipo;

    public Cliente(TipoPagamento tipoPagamento, String nome, TipoCliente tipo) {
        this.tipoPagamento = tipoPagamento;
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoPagamento=" + tipoPagamento +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", Numero do Tipo Pagamento: " + tipo.getTipo()+
                ", Tipo Pagamento: " + tipo.getNome()+
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
