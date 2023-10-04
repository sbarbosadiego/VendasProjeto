/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoVendaProduto;
import java.util.ArrayList;
import model.ModelVendaProduto;

/**
 * @author Diego Barbosa da Silva
 */
public class ControllerVendaProduto {
    
    private DaoVendaProduto daoVendaProduto = new DaoVendaProduto();
    
    /**
     * Salvar Venda controller
     * @return int
     */
    public int salvarVendaProdutosController(ModelVendaProduto pModelVendaProduto) {
        return this.daoVendaProduto.salvarVendaProdutoDAO(pModelVendaProduto);
    }
    
    /**
     * Excluir pelo código do Venda
     * @param pIdVenda
     * @return boolean
     */
    public boolean excluirVendaProdutosController(int pIdVendaProduto) {
        return this.daoVendaProduto.excluirVendaProdutoDAO(pIdVendaProduto);
    }
    
    /**
     * Editar um Venda
     * @param pModelVenda
     * @return boolean
     */
    public boolean editarVendaProdutosController(ModelVendaProduto pModelVendaProduto) {
        return this.daoVendaProduto.alterarVendaProdutoDAO(pModelVendaProduto);
    }
    
    /**
     * Retornar pelo código de Venda
     * @param pIdVenda
     * @return ModelVendas
     */
    public ModelVendaProduto retornarVendaProdutosController(int pIdVenda) {
        return this.daoVendaProduto.retornarVendaProdutoDAO(pIdVenda);
    }
    
    /**
     * Retornar lista de Vendas
     * @return ArrayList
     */
    public ArrayList<ModelVendaProduto> retornaListaVendaProdutosController() {
        return this.daoVendaProduto.retornarListaVendaProdutoDAO();
    }
    
    /**
     * Salvar lista de produtos de uma venda.
     * @param pListaModelVendasProdutos
     * @return 
     */
    public boolean salvarVendasProdutosController(ArrayList<ModelVendaProduto> pListaModelVendasProdutos) {
        return this.daoVendaProduto.salvarVendaProdutoDAO(pListaModelVendasProdutos);
    }
    
}
