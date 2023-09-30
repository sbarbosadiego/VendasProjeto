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
            this.conectar();
            this.executarSQL("SELECT "
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
                    + "INNER JOIN tbl_cliente Cliente "
                    + "ON Cliente.pk_id_cliente = Vendas.fk_cliente;");
            while (this.getResultSet().next()) {
                modelVenda = new ModelVendas();
                modelClientes = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();
                
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVendaData(this.getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVendaDesconto(this.getResultSet().getDouble(6));
                
                modelClientes.setIdCliente(this.getResultSet().getInt(1));
                modelClientes.setClienteNome(this.getResultSet().getString(2));
                modelClientes.setClienteEndereco(this.getResultSet().getString(3));
                modelClientes.setClienteBairro(this.getResultSet().getString(4));
                modelClientes.setClienteNumero(this.getResultSet().getString(5));
                modelClientes.setClienteCidade(this.getResultSet().getString(6));
                modelClientes.setClienteUf(this.getResultSet().getString(7));
                modelClientes.setClienteCep(this.getResultSet().getString(8));
                modelClientes.setClienteTelefone(this.getResultSet().getString(9));
                modelClientes.setClienteComplemento(this.getResultSet().getString(10));
                
                modelVendasCliente.setModelVenda(modelVenda);
                modelVendasCliente.setModelCliente(modelClientes);
                
                listaModelVendasClientes.add(modelVendasCliente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            this.fecharConexao();
        }
        return listaModelVendasClientes;
    }
    
}
