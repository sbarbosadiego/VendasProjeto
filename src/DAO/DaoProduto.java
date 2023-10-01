/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelProdutos;

/**
 * @author Diego Barbosa da Silva
 */
public class DaoProduto extends ConexaoMySql {

    /**
     * Inseri um produto no banco de dados.
     *
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            conectar();
            return insertSQL("INSERT INTO tbl_produto ("
                    + "produto_nome,"
                    + "produto_fabricante,"
                    + "produto_preco,"
                    + "produto_custo,"
                    + "produto_estoque"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getProdutoNome() + "',"
                    + "'" + pModelProdutos.getProdutoFabricante() + "',"
                    + "'" + pModelProdutos.getProdutoPreco() + "',"
                    + "'" + pModelProdutos.getProdutoCusto() + "',"
                    + "'" + pModelProdutos.getProdutoEstoque() + "'"
                    + ");");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Exclui o produto no banco de dados.
     *
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            conectar();
            return executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "';");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Alterar atributos do produto.
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            conectar();
            return executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "produto_nome = '" + pModelProdutos.getProdutoNome() + "',"
                    + "produto_fabricante = '" + pModelProdutos.getProdutoFabricante() + "',"
                    + "produto_preco = '" + pModelProdutos.getProdutoPreco() + "',"
                    + "produto_custo = '" + pModelProdutos.getProdutoCusto() + "',"
                    + "produto_estoque = '" + pModelProdutos.getProdutoEstoque() + "'"
                    + "WHERE pk_id_produto = '" + pModelProdutos.getIdProduto() + "';"
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Consulta de produto por código.
     *
     * @param pIdProduto
     * @return modelProduto
     */
    public ModelProdutos retornarProdutoDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            conectar();
            executarSQL("SELECT "
                    + "pk_id_produto, "
                    + "produto_nome, "
                    + "produto_fabricante, "
                    + "produto_preco, "
                    + "produto_custo, "
                    + "produto_estoque "
                    + "FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "'");
            while (getResultSet().next()) {
                modelProdutos.setIdProduto(getResultSet().getInt(1));
                modelProdutos.setProdutoNome(getResultSet().getString(2));
                modelProdutos.setProdutoFabricante(getResultSet().getString(3));
                modelProdutos.setProdutoPreco(getResultSet().getDouble(4));
                modelProdutos.setProdutoCusto(getResultSet().getDouble(5));
                modelProdutos.setProdutoEstoque(getResultSet().getInt(6));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * Retorna informações do produto pelo nome.
     *
     * @param nome
     * @return modelProdutos
     */
    public ModelProdutos retornarProdutoNomeDAO(String nome) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            conectar();
            executarSQL("SELECT * FROM tbl_produto WHERE produto_nome LIKE '" + nome + "%' LIMIT 1;");
            while (getResultSet().next()) {
                modelProdutos.setIdProduto(getResultSet().getInt(1));
                modelProdutos.setProdutoNome(getResultSet().getString(2));
                modelProdutos.setProdutoFabricante(getResultSet().getString(3));
                modelProdutos.setProdutoPreco(getResultSet().getDouble(4));
                modelProdutos.setProdutoCusto(getResultSet().getDouble(5));
                modelProdutos.setProdutoEstoque(getResultSet().getInt(6));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * Retornar lista de produtos.
     *
     * @return listaModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            conectar();
            executarSQL("SELECT pk_id_produto, produto_nome, produto_fabricante, produto_preco, produto_custo, produto_estoque FROM tbl_produto;");
            while (getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(getResultSet().getInt(1));
                modelProdutos.setProdutoNome(getResultSet().getString(2));
                modelProdutos.setProdutoFabricante(getResultSet().getString(3));
                modelProdutos.setProdutoPreco(getResultSet().getDouble(4));
                modelProdutos.setProdutoCusto(getResultSet().getDouble(5));
                modelProdutos.setProdutoEstoque(getResultSet().getInt(6));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return listaModelProdutos;
    }

    /**
     * Retorna uma lista de produtos de acordo pelo nome.
     *
     * @param cliente
     * @return listaModelProdutos
     */
    public ArrayList<ModelProdutos> listarPesquisaProduto(String cliente) {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        try {
            conectar();
            executarSQL("SELECT * FROM tbl_produto WHERE produto_nome LIKE '" + cliente + "%' ORDER BY produto_nome;");
            while (getResultSet().next()) {
                ModelProdutos modelProdutos = new ModelProdutos();
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(getResultSet().getInt(1));
                modelProdutos.setProdutoNome(getResultSet().getString(2));
                modelProdutos.setProdutoFabricante(getResultSet().getString(3));
                modelProdutos.setProdutoPreco(getResultSet().getDouble(4));
                modelProdutos.setProdutoCusto(getResultSet().getDouble(5));
                modelProdutos.setProdutoEstoque(getResultSet().getInt(6));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            fecharConexao();
        }
        return listaModelProdutos;
    }

}
