/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 * @author Diego Barbosa da Silva
 */
public class ModelVendasCliente {
    
    private ModelVendas modelvenda;
    private ModelCliente modelcliente;
    private ArrayList<ModelVendasCliente> listaModelVendasClientes;
    
    public ModelVendas getModelVenda() {
        return modelvenda;
    }

    public void setModelVenda(ModelVendas modelvenda) {
        this.modelvenda = modelvenda;
    }

    public ModelCliente getModelCliente() {
        return modelcliente;
    }

    public void setModelCliente(ModelCliente modelcliente) {
        this.modelcliente = modelcliente;
    }

    public ArrayList<ModelVendasCliente> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    public void setListaModelVendasClientes(ArrayList<ModelVendasCliente> listaModelVendasClientes) {
        this.listaModelVendasClientes = listaModelVendasClientes;
    }
    
    
    
    
}
