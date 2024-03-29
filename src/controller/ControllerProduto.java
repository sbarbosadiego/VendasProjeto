/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoProduto;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 * @author Diego Barbosa da Silva
 */
public class ControllerProduto {

    private DaoProduto daoProdutos = new DaoProduto();

    /**
     * Salvar produto controller
     *
     * @return int
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    /**
     * Excluir pelo código do produto
     *
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoController(int pIdProduto) {
        return this.daoProdutos.excluirProdutoDAO(pIdProduto);
    }

    /**
     * Editar um produto
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean editarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }

    /**
     * Retornar pelo código de produto
     *
     * @param pIdProduto
     * @return ModelProdutos
     */
    public ModelProdutos retornarProdutoController(int pIdProduto) {
        return this.daoProdutos.retornarProdutoDAO(pIdProduto);
    }

    /**
     * Retorna o nome de um registro na base de dados.
     *
     * @param nome
     * @return
     */
    public ModelProdutos retornarProdutoNomeController(String nome) {
        return this.daoProdutos.retornarProdutoNomeDAO(nome);
    }

    /**
     * Retornar lista de produtos
     *
     * @return ArrayList
     */
    public ArrayList<ModelProdutos> retornaListaProdutosController() {
        return this.daoProdutos.retornarListaProdutosDAO();
    }

    /**
     * Retornar lista de produtos pelo nome.
     *
     * @param produto
     * @return
     */
    public ArrayList<ModelProdutos> retornarListarPesquisaProdutosController(String produto) {
        return this.daoProdutos.listarPesquisaProduto(produto);
    }
}
