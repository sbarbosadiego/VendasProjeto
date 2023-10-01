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

/**
 * @author Diego Barbosa da Silva
 */
public class DaoCliente extends ConexaoMySql {

    /**
     * Inseri um registro de cliente na base de dados.
     *
     * @param pModelClientes
     * @return int
     */
    public int salvarClientesDAO(ModelCliente pModelClientes) {
        try {
            conectar();
            return insertSQL("INSERT INTO tbl_cliente ("
                    + "cliente_nome, "
                    + "cliente_endereco, "
                    + "cliente_bairro, "
                    + "cliente_cidade, "
                    + "cliente_uf, "
                    + "cliente_cep, "
                    + "cliente_telefone, "
                    + "cliente_complemento, "
                    + "cliente_numero"
                    + ") VALUES ("
                    + "'" + pModelClientes.getClienteNome() + "',"
                    + "'" + pModelClientes.getClienteEndereco() + "',"
                    + "'" + pModelClientes.getClienteBairro() + "',"
                    + "'" + pModelClientes.getClienteCidade() + "',"
                    + "'" + pModelClientes.getClienteUf() + "',"
                    + "'" + pModelClientes.getClienteCep() + "',"
                    + "'" + pModelClientes.getClienteTelefone() + "',"
                    + "'" + pModelClientes.getClienteComplemento() + "',"
                    + "'" + pModelClientes.getClienteNumero() + "'"
                    + ");");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Exclui um registro de cliente na base de dados.
     *
     * @param pIdCliente
     * @return boolean
     */
    public boolean excluirClienteDAO(int pIdCliente) {
        try {
            conectar();
            return executarUpdateDeleteSQL(
                    "DELETE FROM tbl_cliente WHERE pk_id_cliente = '" + pIdCliente + "';");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Altera o registro de um cliente na base de dados.
     *
     * @param pModelClientes
     * @return boolean
     */
    public boolean editarClienteDAO(ModelCliente pModelClientes) {
        try {
            conectar();
            return executarUpdateDeleteSQL(
                    "UPDATE tbl_cliente SET "
                    + "cliente_nome = '" + pModelClientes.getClienteNome() + "', "
                    + "cliente_endereco = '" + pModelClientes.getClienteEndereco() + "', "
                    + "cliente_bairro = '" + pModelClientes.getClienteBairro() + "', "
                    + "cliente_numero = '" + pModelClientes.getClienteNumero() + "', "
                    + "cliente_cidade = '" + pModelClientes.getClienteCidade() + "', "
                    + "cliente_uf = '" + pModelClientes.getClienteUf() + "', "
                    + "cliente_cep = '" + pModelClientes.getClienteCep() + "', "
                    + "cliente_telefone = '" + pModelClientes.getClienteTelefone() + "', "
                    + "cliente_complemento = '" + pModelClientes.getClienteComplemento() + "' "
                    + "WHERE pk_id_cliente = '" + pModelClientes.getIdCliente() + "';"
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Recupera informações de um registro de cliente na base de dados.
     *
     * @param pIdCliente
     * @return modelCliente
     */
    public ModelCliente retornarClienteDAO(int pIdCliente) {
        ModelCliente modelClientes = new ModelCliente();
        try {
            conectar();
            executarSQL("SELECT "
                    + "pk_id_cliente, "
                    + "cliente_nome, "
                    + "cliente_endereco, "
                    + "cliente_bairro, "
                    + "cliente_numero, "
                    + "cliente_cidade, "
                    + "cliente_uf, "
                    + "cliente_cep, "
                    + "cliente_telefone, "
                    + "cliente_complemento "
                    + "FROM tbl_cliente WHERE pk_id_cliente = '" + pIdCliente + "'");
            while (getResultSet().next()) {
                modelClientes.setIdCliente(getResultSet().getInt(1));
                modelClientes.setClienteNome(getResultSet().getString(2));
                modelClientes.setClienteEndereco(getResultSet().getString(3));
                modelClientes.setClienteBairro(getResultSet().getString(4));
                modelClientes.setClienteNumero(getResultSet().getString(5));
                modelClientes.setClienteCidade(getResultSet().getString(6));
                modelClientes.setClienteUf(getResultSet().getString(7));
                modelClientes.setClienteCep(getResultSet().getString(8));
                modelClientes.setClienteTelefone(getResultSet().getString(9));
                modelClientes.setClienteComplemento(getResultSet().getString(10));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return modelClientes;
    }

    /**
     * Retorna informações de registro pelo nome do cliente.
     *
     * @param nome
     * @return modelCliente
     */
    public ModelCliente retornarClienteNomeDAO(String nome) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            conectar();
            executarSQL("SELECT * FROM tbl_cliente WHERE cliente_nome LIKE '" + nome + "%' LIMIT 1;");
            while (getResultSet().next()) {
                modelCliente.setIdCliente(getResultSet().getInt(1));
                modelCliente.setClienteNome(getResultSet().getString(2));
                modelCliente.setClienteEndereco(getResultSet().getString(3));
                modelCliente.setClienteBairro(getResultSet().getString(4));
                modelCliente.setClienteNumero(getResultSet().getString(5));
                modelCliente.setClienteCidade(getResultSet().getString(6));
                modelCliente.setClienteUf(getResultSet().getString(7));
                modelCliente.setClienteCep(getResultSet().getString(8));
                modelCliente.setClienteTelefone(getResultSet().getString(9));
                modelCliente.setClienteComplemento(getResultSet().getString(10));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return modelCliente;
    }

    /**
     * Retornar lista de registro de clientes.
     *
     * @return listaModelClientes
     */
    public ArrayList<ModelCliente> retornarListaClientesDAO() {
        ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
        ModelCliente modelClientes = new ModelCliente();
        try {
            conectar();
            executarSQL("SELECT "
                    + "pk_id_cliente, "
                    + "cliente_nome, "
                    + "cliente_endereco, "
                    + "cliente_bairro, "
                    + "cliente_numero, "
                    + "cliente_cidade, "
                    + "cliente_uf, "
                    + "cliente_cep, "
                    + "cliente_telefone, "
                    + "cliente_complemento "
                    + "FROM tbl_cliente;");
            while (getResultSet().next()) {
                modelClientes = new ModelCliente();
                modelClientes.setIdCliente(getResultSet().getInt(1));
                modelClientes.setClienteNome(getResultSet().getString(2));
                modelClientes.setClienteEndereco(getResultSet().getString(3));
                modelClientes.setClienteBairro(getResultSet().getString(4));
                modelClientes.setClienteNumero(getResultSet().getString(5));
                modelClientes.setClienteCidade(getResultSet().getString(6));
                modelClientes.setClienteUf(getResultSet().getString(7));
                modelClientes.setClienteCep(getResultSet().getString(8));
                modelClientes.setClienteTelefone(getResultSet().getString(9));
                modelClientes.setClienteComplemento(getResultSet().getString(10));
                listaModelClientes.add(modelClientes);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return listaModelClientes;
    }

    /**
     * Retorna uma lista de clientes de acordo pelo nome.
     *
     * @param cliente
     * @return listaModelClientes
     */
    public ArrayList<ModelCliente> listarPesquisaCliente(String cliente) {
        ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
        try {
            conectar();
            executarSQL("SELECT * FROM tbl_cliente WHERE cliente_nome LIKE '" + cliente + "%' ORDER BY cliente_nome;");
            while (getResultSet().next()) {
                ModelCliente modelClientes = new ModelCliente();
                modelClientes.setIdCliente(getResultSet().getInt(1));
                modelClientes.setClienteNome(getResultSet().getString(2));
                modelClientes.setClienteEndereco(getResultSet().getString(3));
                modelClientes.setClienteBairro(getResultSet().getString(4));
                modelClientes.setClienteNumero(getResultSet().getString(5));
                modelClientes.setClienteCidade(getResultSet().getString(6));
                modelClientes.setClienteUf(getResultSet().getString(7));
                modelClientes.setClienteCep(getResultSet().getString(8));
                modelClientes.setClienteTelefone(getResultSet().getString(9));
                modelClientes.setClienteComplemento(getResultSet().getString(10));
                listaModelClientes.add(modelClientes);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return listaModelClientes;
    }

}
