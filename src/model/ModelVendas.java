/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 * @author Diego Barbosa da Silva
 */
public class ModelVendas {

    private int idVenda;
    private int cliente;
    private Date vendaData;
    private Double vendaValorLiquido;
    private Double vendaValorBruto;
    private Double vendaDesconto;

    public ModelVendas() {
        
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public Date getVendaData() {
        return vendaData;
    }

    public void setVendaData(Date vendaData) {
        this.vendaData = vendaData;
    }

    public double getVendaValorLiquido() {
        return vendaValorLiquido;
    }

    public void setVendaValorLiquido(Double vendaValorLiquido) {
        this.vendaValorLiquido = vendaValorLiquido;
    }

    public double getVendaValorBruto() {
        return vendaValorBruto;
    }

    public void setVendaValorBruto(Double vendaValorBruto) {
        this.vendaValorBruto = vendaValorBruto;
    }

    public double getVendaDesconto() {
        return vendaDesconto;
    }

    public void setVendaDesconto(Double vendaDesconto) {
        this.vendaDesconto = vendaDesconto;
    }

}
