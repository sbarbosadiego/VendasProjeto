/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 * @author Diego Barbosa da Silva
 */
public class ModelProdutos {
    
    private int idProduto;
    private String produtoNome;
    private String produtoFabricante;
    private Double produtoCusto;
    private Double produtoPreco;
    private int produtoEstoque;
    
    // Getters e Setters
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public Double getProdutoPreco() {
        return produtoPreco;
    }

    public void setProdutoPreco(Double produtoValor) {
        this.produtoPreco = produtoValor;
    }

    public int getProdutoEstoque() {
        return produtoEstoque;
    }

    public void setProdutoEstoque(int produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }

    public String getProdutoFabricante() {
        return produtoFabricante;
    }

    public void setProdutoFabricante(String produtoFabricante) {
        this.produtoFabricante = produtoFabricante;
    }

    public Double getProdutoCusto() {
        return produtoCusto;
    }

    public void setProdutoCusto(Double produtoCusto) {
        this.produtoCusto = produtoCusto;
    }
    
    
    
}
