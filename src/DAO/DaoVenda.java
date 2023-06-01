/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelVenda;

/**
 * @author Diego Barbosa da Silva
 */
public class DaoVenda extends ConexaoMySql {
    
    /**
     * Inseri o registro de venda no banco de dados.
     * @param pModelVenda
     * @return int
     */
    public int salvarVendaDAO(ModelVenda pModelVenda) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_vendas ("
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
            this.fecharConexao();
        }
    }
    
    /**
     * Exclui um registro de venda.
     * @param pIdVenda
     * @return boolean
     */
    public boolean excluirVendaDAO(int pIdVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas WHERE pk_id_vendas = '" + pIdVenda + "';");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Alterar registro de venda.
     * @param pModelVenda
     * @return boolean
     */
    public boolean alterarVendaDAO(ModelVenda pModelVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
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
            this.fecharConexao();
        }
    }
    
    /**
     * Consulta de venda por código.
     * @param pIdVenda
     * @return modelVenda
     */
    public ModelVenda retornarVendaDAO(int pIdVenda) {
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_vendas, "
                    + "fk_cliente, "
                    + "venda_data, "
                    + "venda_valor_liquido, "
                    + "venda_valor_bruto, "
                    + "venda_desconto "
                    + "FROM tbl_vendas WHERE pk_id_Venda = '"+pIdVenda+"'");
            while (this.getResultSet().next()) {
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getString(2));
                modelVenda.setVendaData(this.getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVendaDesconto(this.getResultSet().getDouble(6));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            this.fecharConexao();
        }
        return modelVenda;
    }
    
    /**
     * Retornar lista de vendas.
     * @return listaModelVendas
     */
    public ArrayList<ModelVenda> retornarListaVendaDAO() {
        ArrayList<ModelVenda> listaModelVendas = new ArrayList<>();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_vendas, "
                    + "fk_cliente, "
                    + "venda_data, "
                    + "venda_valor_liquido, "
                    + "venda_valor_bruto, "
                    + "venda_desconto "
                    + "FROM tbl_vendas;");
            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getString(2));
                modelVenda.setVendaData(this.getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVendaDesconto(this.getResultSet().getDouble(6));
                listaModelVendas.add(modelVenda);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            this.fecharConexao();
        }
        return listaModelVendas;
    }
    
}
