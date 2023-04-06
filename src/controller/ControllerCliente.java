/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoClientes;
import java.util.ArrayList;
import model.ModelClientes;

/**
 *
 * @author di_an
 */
public class ControllerCliente {
    
    private DaoClientes daoClientes = new DaoClientes();
    
    /**
     * Salvar Cliente controller
     * @return int
     */
    public int salvarClienteController(ModelClientes pModelClientes) {
        return this.daoClientes.salvarClientesDAO(pModelClientes);
    }
    
    /**
     * Excluir pelo código do cliente
     * @param pIdCliente
     * @return boolean
     */
    public boolean excluirClienteController(int pIdCliente) {
        return this.daoClientes.excluirClienteDAO(pIdCliente);
    }
    
    /**
     * Editar um cliente
     * @param pModelClientes
     * @return boolean
     */
    public boolean editarClienteController(ModelClientes pModelClientes) {
        return this.daoClientes.alterarClienteDAO(pModelClientes);
    }
    
    /**
     * Retornar pelo código de cliente
     * @param pIdProduto
     * @return ModelClientes
     */
    public ModelClientes retornarClienteController(int pIdCliente) {
        return this.daoClientes.retornarClienteDAO(pIdCliente);
    }
    
    /**
     * Retornar lista de clientes
     * @return ArrayList
     */
    public ArrayList<ModelClientes> retornaListaClientesController() {
        return this.daoClientes.retornarListaClientesDAO();
    }
    
}
