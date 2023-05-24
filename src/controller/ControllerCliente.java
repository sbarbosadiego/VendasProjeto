/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoCliente;
import java.util.ArrayList;
import model.ModelCliente;

/**
 *
 * @author Diego Barbosa da Silva 
 */
public class ControllerCliente {
    
    private DaoCliente daoClientes = new DaoCliente();
    
    /**
     * Salvar Cliente controller
     * @return int
     */
    public int salvarClienteController(ModelCliente pModelClientes) {
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
    public boolean editarClienteController(ModelCliente pModelClientes) {
        return this.daoClientes.editarClienteDAO(pModelClientes);
    }
    
    /**
     * Retornar pelo código de cliente
     * @param pIdProduto
     * @return ModelCliente
     */
    public ModelCliente retornarClienteController(int pIdCliente) {
        return this.daoClientes.retornarClienteDAO(pIdCliente);
    }
    
    /**
     * Retornar lista de clientes
     * @return ArrayList
     */
    public ArrayList<ModelCliente> retornaListaClientesController() {
        return this.daoClientes.retornarListaClientesDAO();
    }
    
    /**
     * Retorna lista clientes pelo nome.
     * @param cliente
     * @return ArrayList
     */
    public ArrayList<ModelCliente> retornarListarPesquisaClientesController(String cliente) {
        return this.daoClientes.listarPesquisaCliente(cliente);
    }
    
}
