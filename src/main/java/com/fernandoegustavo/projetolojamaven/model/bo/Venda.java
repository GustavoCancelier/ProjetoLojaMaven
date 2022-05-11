package com.fernandoegustavo.projetolojamaven.model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Venda implements Serializable {
    @Id
    private int idvenda;
    
    @Column
    private String serieVenda;
    
    @Column
    private String dtVenda;
    
    @Column
    private String hrVenda;
    
    @Column
    private float valDescontoVenda;
    
    @Column
    private float valTotalVenda;
    
    @OneToOne (fetch = FetchType.LAZY)
    private Cliente cliente_idcliente;
    
    @OneToOne (fetch = FetchType.LAZY)
    private Vendedor vendedor_idvendedor;
    
    @OneToOne (fetch = FetchType.LAZY)
    private CondicaoPagamento condicaoPagamento_idcondicaoPagamento;
    
    @Column
    private int diaVencimentoParcela;

    public Venda() {
    }

    public Venda(int idvenda, String serieVenda, String dtVenda, String hrVenda, float valDescontoVenda, float valTotalVenda, Cliente cliente_idcliente, CondicaoPagamento condicaoPagamento_idcondicaoPagamento, int diaVencimentoParcela) {
        this.idvenda = idvenda;
        this.serieVenda = serieVenda;
        this.dtVenda = dtVenda;
        this.hrVenda = hrVenda;
        this.valDescontoVenda = valDescontoVenda;
        this.valTotalVenda = valTotalVenda;
        this.cliente_idcliente = cliente_idcliente;
        this.condicaoPagamento_idcondicaoPagamento = condicaoPagamento_idcondicaoPagamento;
        this.diaVencimentoParcela = diaVencimentoParcela;
    }

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public String getSerieVenda() {
        return serieVenda;
    }

    public void setSerieVenda(String serieVenda) {
        this.serieVenda = serieVenda;
    }

    public String getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(String dtVenda) {
        this.dtVenda = dtVenda;
    }

    public String getHrVenda() {
        return hrVenda;
    }

    public void setHrVenda(String hrVenda) {
        this.hrVenda = hrVenda;
    }

    public float getValDescontoVenda() {
        return valDescontoVenda;
    }

    public void setValDescontoVenda(float valDescontoVenda) {
        this.valDescontoVenda = valDescontoVenda;
    }

    public float getValTotalVenda() {
        return valTotalVenda;
    }

    public void setValTotalVenda(float valTotalVenda) {
        this.valTotalVenda = valTotalVenda;
    }

    public Cliente getCliente_idcliente() {
        return cliente_idcliente;
    }

    public void setCliente_idcliente(Cliente cliente_idcliente) {
        this.cliente_idcliente = cliente_idcliente;
    }

    public CondicaoPagamento getCondicaoPagamento_idcondicaoPagamento() {
        return condicaoPagamento_idcondicaoPagamento;
    }

    public void setCondicaoPagamento_idcondicaoPagamento(CondicaoPagamento condicaoPagamento_idcondicaoPagamento) {
        this.condicaoPagamento_idcondicaoPagamento = condicaoPagamento_idcondicaoPagamento;
    }

    public int getDiaVencimentoParcela() {
        return diaVencimentoParcela;
    }

    public void setDiaVencimentoParcela(int diaVencimentoParcela) {
        this.diaVencimentoParcela = diaVencimentoParcela;
    }

    public Vendedor getVendedor_idvendedor() {
	return vendedor_idvendedor;
    }

    public void setVendedor_idvendedor(Vendedor vendedor_idvendedor) {
	this.vendedor_idvendedor = vendedor_idvendedor;
    }

    @Override
    public String toString() {
        return this.getSerieVenda();
    }
    
    
}
