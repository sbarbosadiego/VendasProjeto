/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * @author Diego Barbosa da Silva
 */
public class ModelVendaProduto {
    
    private int idVendaProduto;
    private int produto;
    private int venda;
    private Double vendaProdutoValor;
    private int vendaProdutoQuantidade;

    public ModelVendaProduto() {
        
    }

    public int getIdVendaProduto() {
        return idVendaProduto;
    }

    public void setIdVendaProduto(int idVendaProduto) {
        this.idVendaProduto = idVendaProduto;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

    public Double getVendaProdutoValor() {
        return vendaProdutoValor;
    }

    public void setVendaProdutoValor(Double vendaProdutoValor) {
        this.vendaProdutoValor = vendaProdutoValor;
    }

    public int getVendaProdutoQuantidade() {
        return vendaProdutoQuantidade;
    }

    public void setVendaProdutoQuantidade(int vendaProdutoQuantidade) {
        this.vendaProdutoQuantidade = vendaProdutoQuantidade;
    }
    
}
