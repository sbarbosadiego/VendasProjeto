/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoVenda;
import java.util.ArrayList;
import model.ModelVenda;

/**
 *
 * @author Diego Barbosa da Silva
 */
public class ControllerVenda {
    
    private DaoVenda daoVenda = new DaoVenda();
    
    /**
     * Salvar Venda controller
     * @return int
     */
    public int salvarVendaController(ModelVenda pModelVenda) {
        return this.daoVenda.salvarVendaDAO(pModelVenda);
    }
    
    /**
     * Excluir pelo código do Venda
     * @param pIdVenda
     * @return boolean
     */
    public boolean excluirVendaController(int pIdVenda) {
        return this.daoVenda.excluirVendaDAO(pIdVenda);
    }
    
    /**
     * Editar um Venda
     * @param pModelVenda
     * @return boolean
     */
    public boolean editarVendaController(ModelVenda pModelVenda) {
        return this.daoVenda.alterarVendaDAO(pModelVenda);
    }
    
    /**
     * Retornar pelo código de Venda
     * @param pIdVenda
     * @return ModelVenda
     */
    public ModelVenda retornarVendaController(int pIdVenda) {
        return this.daoVenda.retornarVendaDAO(pIdVenda);
    }
    
    /**
     * Retornar lista de Vendas
     * @return ArrayList
     */
    public ArrayList<ModelVenda> retornaListaVendaController() {
        return this.daoVenda.retornarListaVendaDAO();
    }
    
}
