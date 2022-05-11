package com.fernandoegustavo.projetolojamaven.model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa implements Serializable {
    
    @Id
    private int idcliente;
    
    @Column
    private String dtNascCliente;
    
    @Column
    private String cpfCliente;
    
    @Column
    private String rgCliente;
    
    @Column
    private String foneCliente;
    
    @Column
    private String fone2Cliente;
    
    @OneToOne (fetch = FetchType.LAZY)
    private Endereco endereco_idcep;

    public Cliente() {
    }

    public Cliente(int idcliente, String dtNascCliente, String cpfCliente, String rgCliente, String foneCliente, String fone2Cliente, Endereco endereco_idcep, String nome, String compleEndereco, String cep, String email, String status) {
        super(nome, compleEndereco, cep, email, status);
        this.idcliente = idcliente;
        this.dtNascCliente = dtNascCliente;
        this.cpfCliente = cpfCliente;
        this.rgCliente = rgCliente;
        this.foneCliente = foneCliente;
        this.fone2Cliente = fone2Cliente;
        this.endereco_idcep = endereco_idcep;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getDtNascCliente() {
        return dtNascCliente;
    }

    public void setDtNascCliente(String dtNascCliente) {
        this.dtNascCliente = dtNascCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getFoneCliente() {
        return foneCliente;
    }

    public void setFoneCliente(String foneCliente) {
        this.foneCliente = foneCliente;
    }

    public String getFone2Cliente() {
        return fone2Cliente;
    }

    public void setFone2Cliente(String fone2Cliente) {
        this.fone2Cliente = fone2Cliente;
    }

    public Endereco getEndereco_idcep() {
        return endereco_idcep;
    }

    public void setEndereco_idcep(Endereco endereco_idcep) {
        this.endereco_idcep = endereco_idcep;
    }

   

    @Override
    public String toString() {
        return this.getCpfCliente() + ", " + this.getRgCliente();
    }
    
    
}
