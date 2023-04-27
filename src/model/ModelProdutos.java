/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 * @author Diego Barbosa
 */
public class ModelProdutos {
    
    private int idProduto;
    private String produtoNome;
    private Double produtoValor;
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

    public Double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(Double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public int getProdutoEstoque() {
        return produtoEstoque;
    }

    public void setProdutoEstoque(int produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }
    
}
