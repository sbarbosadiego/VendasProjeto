/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelClientes;

/**
 * @author Diego Barbosa
 */
public class DaoClientes extends ConexaoMySql {

    /**
     * Inseri um Cliente no banco de dados
     * @param pModelClientes
     * @return int
     */
    public int salvarClientesDAO(ModelClientes pModelClientes) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_cliente ("
                    + "cliente_nome,"
                    + "cliente_endereco,"
                    + "cliente_bairro"
                    + "cliente_cidade"
                    + "cliente_uf"
                    + "cliente_cep"
                    + "cliente_telefone"
                    + "cliente_complemento"
                    + "cliente_numero"
                    + ") VALUES ("
                    + "'" + pModelClientes.getClienteNome() + "',"
                    + "'" + pModelClientes.getClienteEndereco() + "',"
                    + "'" + pModelClientes.getClienteBairro() + "'"
                    + "'" + pModelClientes.getClienteCidade() + "'"
                    + "'" + pModelClientes.getClienteUf() + "'"
                    + "'" + pModelClientes.getClienteCep() + "'"
                    + "'" + pModelClientes.getClienteTelefone() + "'"
                    + "'" + pModelClientes.getClienteComplemento() + "'"
                    + "'" + pModelClientes.getClienteNumero() + "'"
                    + ");");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Exclui o Cliente no banco de dados
     * @param pIdCliente
     * @return boolean
     */
    public boolean excluirClienteDAO(int pIdCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_Cliente WHERE pk_id_cliente = '" + pIdCliente + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Alterar atributos do Cliente
     * @param pModelClientes
     * @return boolean
     */
    public boolean alterarClienteDAO(ModelClientes pModelClientes) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_Cliente SET "
                    + "cliente_nome = '" + pModelClientes.getClienteNome() + "',"
                    + "cliente_endereco = '" + pModelClientes.getClienteEndereco() + "',"
                    + "cliente_bairro = '" + pModelClientes.getClienteBairro() + "'"
                    + "cliente_numero = '" + pModelClientes.getClienteNumero() + "'"
                    + "cliente_cidade = '" + pModelClientes.getClienteCidade() + "'"
                    + "cliente_uf = '" + pModelClientes.getClienteUf() + "'"
                    + "cliente_cep = '" + pModelClientes.getClienteCep() + "'"
                    + "cliente_telefone = '" + pModelClientes.getClienteTelefone() + "'"
                    + "cliente_complemento = '" + pModelClientes.getClienteComplemento() + "'"
                    + "WHERE pk_id_Cliente = '" + pModelClientes.getIdCliente() + "';"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Consulta de Cliente por código
     * @param pIdCliente
     * @return modelCliente
     */
    public ModelClientes retornarClienteDAO(int pIdCliente) {
        ModelClientes modelClientes = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL("SELECT "
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
                    + "FROM tbl_Cliente WHERE pk_id_cliente = '" + pIdCliente + "'");
            while (this.getResultSet().next()) {
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelClientes;
    }

    /**
     * Retornar lista de Clientes
     * @return listaModelClientes
     */
    public ArrayList<ModelClientes> retornarListaClientesDAO() {
        ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();
        ModelClientes modelClientes = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL("SELECT "
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
            while (this.getResultSet().next()) {
                modelClientes = new ModelClientes();
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
                listaModelClientes.add(modelClientes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelClientes;
    }

}
