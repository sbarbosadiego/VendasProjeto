/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendaProduto;

/**
 * @author Diego Barbosa
 */
public class DaoVendaProduto extends ConexaoMySql {
    
    /**
     * Inseri produtos em uma venda.
     * @param pModelVendaProduto
     * @return int
     */
    public int salvarVendaProdutoDAO(ModelVendaProduto pModelVendaProduto) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_vendas_produtos ("
                    + "fk_produto,"
                    + "venda_venda,"
                    + "venda_produto_valor,"
                    + "venda_produto_quantidade"
                    + ") VALUES ("
                    + "'"+pModelVendaProduto.getProduto()+"',"
                    + "'"+pModelVendaProduto.getVenda()+"',"
                    + "'"+pModelVendaProduto.getVendaProdutoValor()+"',"
                    + "'"+pModelVendaProduto.getVendaProdutoQuantidade()+"'"
                    + ");");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Exclui o produto de uma venda.
     * @param pIdVendaProduto
     * @return boolean
     */
    public boolean excluirVendaProdutoDAO(int pIdVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas_produtos WHERE pk_id_venda_produto = '" + pIdVendaProduto + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Alterar o produto de uma venda.
     * @param pModelVendaProduto
     * @return boolean
     */
    public boolean alterarVendaProdutoDAO(ModelVendaProduto pModelVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas_produtos SET "
                            + "fk_produto = '"+pModelVendaProduto.getProduto()+"',"
                            + "fk_venda = '"+pModelVendaProduto.getVenda()+"',"
                            + "venda_produto_valor = '"+pModelVendaProduto.getVendaProdutoValor()+"',"
                            + "venda_produto_quantidade = '"+pModelVendaProduto.getVendaProdutoQuantidade()+"'"
                            + "WHERE pk_id_vendas_produto = '"+pModelVendaProduto.getIdVendaProduto()+"';"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Consulta produto por código.
     * @param pIdVendaProduto
     * @return modelVenda
     */
    public ModelVendaProduto retornarVendaProdutoDAO(int pIdVendaProduto) {
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_venda_produto, "
                    + "fk_produto, "
                    + "fk_venda, "
                    + "venda_produto_valor, "
                    + "venda_produto_quantidade "
                    + "FROM tbl_vendas_produtos WHERE pk_id_venda_produto = '"+pIdVendaProduto+"'");
            while (this.getResultSet().next()) {
                modelVendaProduto.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendaProduto.setProduto(this.getResultSet().getInt(2));
                modelVendaProduto.setVenda(this.getResultSet().getInt(3));
                modelVendaProduto.setVendaProdutoValor(this.getResultSet().getDouble(4));
                modelVendaProduto.setVendaProdutoQuantidade(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendaProduto;
    }
    
    /**
     * Retornar lista de vendas.
     * @return listaModelVendas
     */
    public ArrayList<ModelVendaProduto> retornarListaVendaProdutoDAO() {
        ArrayList<ModelVendaProduto> listaModelVendaProdutos = new ArrayList<>();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_vendas, fk_cliente, venda_data, venda_valor_liquido, venda_valor_bruto, venda_desconto FROM tbl_vendas_produtos;");
            while (this.getResultSet().next()) {
                modelVendaProduto = new ModelVendaProduto();
                modelVendaProduto.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendaProduto.setProduto(this.getResultSet().getInt(2));
                modelVendaProduto.setVenda(this.getResultSet().getInt(3));
                modelVendaProduto.setVendaProdutoValor(this.getResultSet().getDouble(4));
                modelVendaProduto.setVendaProdutoQuantidade(this.getResultSet().getInt(5));
                listaModelVendaProdutos.add(modelVendaProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendaProdutos;
    }
    
}
