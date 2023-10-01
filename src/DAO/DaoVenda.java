/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelVendas;

/**
 * @author Diego Barbosa da Silva
 */
public class DaoVenda extends ConexaoMySql {
    
    /**
     * Inseri o registro de venda no banco de dados.
     * @param pModelVenda
     * @return int
     */
    public int salvarVendaDAO(ModelVendas pModelVenda) {
        try {
            conectar();
            return insertSQL("INSERT INTO tbl_vendas ("
                    + "fk_cliente,"
                    + "venda_data,"
                    + "venda_valor_liquido,"
                    + "venda_valor_bruto,"
                    + "venda_desconto"
                    + ") VALUES ("
                    + "'"+pModelVenda.getCliente()+"',"
                    + "'"+pModelVenda.getVendaData()+"',"
                    + "'"+pModelVenda.getVendaValorLiquido()+"',"
                    + "'"+pModelVenda.getVendaValorBruto()+"',"
                    + "'"+pModelVenda.getVendaDesconto()+"'"
                    + ");");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        } finally {
            fecharConexao();
        }
    }
    
    /**
     * Exclui um registro de venda.
     * @param pIdVenda
     * @return boolean
     */
    public boolean excluirVendaDAO(int pIdVenda) {
        try {
            conectar();
            return executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas WHERE pk_id_vendas = '" + pIdVenda + "';");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            fecharConexao();
        }
    }
    
    /**
     * Alterar registro de venda.
     * @param pModelVenda
     * @return boolean
     */
    public boolean alterarVendaDAO(ModelVendas pModelVenda) {
        try {
            conectar();
            return executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas SET "
                            + "fk_cliente = '"+pModelVenda.getCliente()+"',"
                            + "venda_valor_liquido = '"+pModelVenda.getVendaValorLiquido()+"',"
                            + "venda_valor_bruto = '"+pModelVenda.getVendaValorBruto()+"',"
                            + "venda_desconto = '"+pModelVenda.getVendaDesconto()+"'"
                            + "WHERE pk_id_vendas = '"+pModelVenda.getIdVenda()+"';"
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            fecharConexao();
        }
    }
    
    /**
     * Consulta de venda por código.
     * @param pIdVenda
     * @return modelVenda
     */
    public ModelVendas retornarVendaDAO(int pIdVenda) {
        ModelVendas modelVenda = new ModelVendas();
        try {
            conectar();
            executarSQL("SELECT "
                    + "pk_id_vendas, "
                    + "fk_cliente, "
                    + "venda_data, "
                    + "venda_valor_liquido, "
                    + "venda_valor_bruto, "
                    + "venda_desconto "
                    + "FROM tbl_vendas WHERE pk_id_Venda = '"+pIdVenda+"'");
            while (getResultSet().next()) {
                modelVenda.setIdVenda(getResultSet().getInt(1));
                modelVenda.setCliente(getResultSet().getInt(2));
                modelVenda.setVendaData(getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(getResultSet().getDouble(4));
                modelVenda.setVendaValorBruto(getResultSet().getDouble(5));
                modelVenda.setVendaDesconto(getResultSet().getDouble(6));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return modelVenda;
    }
    
    /**
     * Retornar lista de vendas.
     * @return listaModelVendas
     */
    public ArrayList<ModelVendas> retornarListaVendaDAO() {
        ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
        ModelVendas modelVenda = new ModelVendas();
        try {
            conectar();
            executarSQL("SELECT pk_id_vendas, "
                    + "fk_cliente, "
                    + "venda_data, "
                    + "venda_valor_liquido, "
                    + "venda_valor_bruto, "
                    + "venda_desconto "
                    + "FROM tbl_vendas;");
            while (getResultSet().next()) {
                modelVenda = new ModelVendas();
                modelVenda.setIdVenda(getResultSet().getInt(1));
                modelVenda.setCliente(getResultSet().getInt(2));
                modelVenda.setVendaData(getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(getResultSet().getDouble(4));
                modelVenda.setVendaValorBruto(getResultSet().getDouble(5));
                modelVenda.setVendaDesconto(getResultSet().getDouble(6));
                listaModelVendas.add(modelVenda);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return listaModelVendas;
    }
    
}
