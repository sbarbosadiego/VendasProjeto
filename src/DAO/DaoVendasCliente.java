/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelCliente;
import model.ModelVendas;
import model.ModelVendasCliente;

/**
 * @author Diego Barbosa da Silva
 */
public class DaoVendasCliente extends ConexaoMySql {
    
    
    public ArrayList<ModelVendasCliente> retornarListaVendasClienteDAO() {
        ArrayList<ModelVendasCliente> listaModelVendasClientes = new ArrayList<>();
        ModelVendas modelVenda = new ModelVendas();
        ModelCliente modelClientes = new ModelCliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            conectar();
            executarSQL("SELECT "
                    + "Vendas.pk_id_vendas, "
                    + "Vendas.fk_cliente, "
                    + "Vendas.venda_data, "
                    + "Vendas.venda_valor_liquido, "
                    + "Vendas.venda_valor_bruto, "
                    + "Vendas.venda_desconto, "
                    + "Cliente.pk_id_cliente, "
                    + "Cliente.cliente_nome, "
                    + "Cliente.cliente_endereco, "
                    + "Cliente.cliente_bairro, "
                    + "Cliente.cliente_numero, "
                    + "Cliente.cliente_cidade, "
                    + "Cliente.cliente_uf, "
                    + "Cliente.cliente_cep, "
                    + "Cliente.cliente_telefone, "
                    + "Cliente.cliente_complemento "
                    + "FROM tbl_vendas Vendas "
                    + "LEFT JOIN tbl_cliente Cliente "
                    + "ON Cliente.pk_id_cliente = Vendas.fk_cliente;");
            while (getResultSet().next()) {
                modelVenda = new ModelVendas();
                modelClientes = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();
                
                modelVenda.setIdVenda(getResultSet().getInt(1));
                modelVenda.setCliente(getResultSet().getInt(2));
                modelVenda.setVendaData(getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(getResultSet().getDouble(4));
                modelVenda.setVendaValorBruto(getResultSet().getDouble(5));
                modelVenda.setVendaDesconto(getResultSet().getDouble(6));
                
                modelClientes.setIdCliente(getResultSet().getInt(7));
                modelClientes.setClienteNome(getResultSet().getString(8));
                modelClientes.setClienteEndereco(getResultSet().getString(9));
                modelClientes.setClienteBairro(getResultSet().getString(10));
                modelClientes.setClienteNumero(getResultSet().getString(11));
                modelClientes.setClienteCidade(getResultSet().getString(12));
                modelClientes.setClienteUf(getResultSet().getString(13));
                modelClientes.setClienteCep(getResultSet().getString(14));
                modelClientes.setClienteTelefone(getResultSet().getString(15));
                modelClientes.setClienteComplemento(getResultSet().getString(16));
                
                modelVendasCliente.setModelVenda(modelVenda);
                modelVendasCliente.setModelCliente(modelClientes);
                
                listaModelVendasClientes.add(modelVendasCliente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return listaModelVendasClientes;
    }
    
}
