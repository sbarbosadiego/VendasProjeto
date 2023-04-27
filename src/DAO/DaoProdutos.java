/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Diego Barbosa
 */
public class DaoProdutos extends ConexaoMySql {
    
    /**
     * Inseri um produto no banco de dados
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto ("
                    + "produto_nome,"
                    + "produto_valor,"
                    + "produto_estoque"
                    + ") VALUES ("
                    + "'"+pModelProdutos.getProdutoNome()+"',"
                    + "'"+pModelProdutos.getProdutoValor()+"',"
                    + "'"+pModelProdutos.getProdutoEstoque()+"'"
                    + ");");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Exclui o produto no banco de dados
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Alterar atributos do produto
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                            + "produto_nome = '"+pModelProdutos.getProdutoNome()+"',"
                            + "produto_valor = '"+pModelProdutos.getProdutoValor()+"',"
                            + "produto_estoque = '"+pModelProdutos.getProdutoEstoque()+"'"
                            + "WHERE pk_id_produto = '"+pModelProdutos.getIdProduto()+"';"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Consulta de produto por código
     * @param pIdProduto
     * @return modelProduto
     */
    public ModelProdutos retornarProdutoDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto, "
                    + "produto_nome, "
                    + "produto_valor, "
                    + "produto_estoque "
                    + "FROM tbl_produto WHERE pk_id_produto = '"+pIdProduto+"'");
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProdutoNome(this.getResultSet().getString(2));
                modelProdutos.setProdutoValor(this.getResultSet().getDouble(3));
                modelProdutos.setProdutoEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }
    
    /**
     * Retornar lista de produtos
     * @return listaModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_produto, produto_nome, produto_valor, produto_estoque FROM tbl_produto;");
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProdutoNome(this.getResultSet().getString(2));
                modelProdutos.setProdutoValor(this.getResultSet().getDouble(3));
                modelProdutos.setProdutoEstoque(this.getResultSet().getInt(4));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutos;
    }
    
}
