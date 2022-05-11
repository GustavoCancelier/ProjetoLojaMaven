package com.fernandoegustavo.projetolojamaven.model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoProduto implements Serializable {
    
    @Id
    private int idTipoProduto;
    
    @Column 
    private String descricaoTipoProduto;

    public TipoProduto() {
    }

    public TipoProduto(int idTipoProduto, String descricaoTipoProduto) {
        this.idTipoProduto = idTipoProduto;
        this.descricaoTipoProduto = descricaoTipoProduto;
    }

    public int getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(int idTipoProduto) {
        this.idTipoProduto = idTipoProduto;
    }

    public String getDescricaoTipoProduto() {
        return descricaoTipoProduto;
    }

    public void setDescricaoTipoProduto(String descricaoTipoProduto) {
        this.descricaoTipoProduto = descricaoTipoProduto;
    }

    @Override
    public String toString() {
        return this.getIdTipoProduto() + ", " + this.getDescricaoTipoProduto();
    }
    
    
}
