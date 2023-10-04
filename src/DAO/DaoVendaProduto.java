/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendaProduto;

/**
 * @author Diego Barbosa da Silva
 */
public class DaoVendaProduto extends ConexaoMySql {

    /**
     * Inseri produtos em uma venda.
     *
     * @param pModelVendaProduto
     * @return int
     */
    public int salvarVendaProdutoDAO(ModelVendaProduto pModelVendaProduto) {
        try {
            conectar();
            return insertSQL("INSERT INTO tbl_vendas_produtos ("
                    + "fk_produto,"
                    + "fk_venda,"
                    + "venda_produto_valor,"
                    + "venda_produto_quantidade"
                    + ") VALUES ("
                    + "'" + pModelVendaProduto.getProduto() + "',"
                    + "'" + pModelVendaProduto.getVenda() + "',"
                    + "'" + pModelVendaProduto.getVendaProdutoValor() + "',"
                    + "'" + pModelVendaProduto.getVendaProdutoQuantidade() + "'"
                    + ");");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Exclui o produto de uma venda.
     *
     * @param pIdVendaProduto
     * @return boolean
     */
    public boolean excluirVendaProdutoDAO(int pIdVendaProduto) {
        try {
            conectar();
            return executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas_produtos WHERE pk_id_venda_produto = '" + pIdVendaProduto + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Alterar o produto de uma venda.
     *
     * @param pModelVendaProduto
     * @return boolean
     */
    public boolean alterarVendaProdutoDAO(ModelVendaProduto pModelVendaProduto) {
        try {
            conectar();
            return executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas_produtos SET "
                    + "fk_produto = '" + pModelVendaProduto.getProduto() + "',"
                    + "fk_venda = '" + pModelVendaProduto.getVenda() + "',"
                    + "venda_produto_valor = '" + pModelVendaProduto.getVendaProdutoValor() + "',"
                    + "venda_produto_quantidade = '" + pModelVendaProduto.getVendaProdutoQuantidade() + "'"
                    + "WHERE pk_id_vendas_produto = '" + pModelVendaProduto.getIdVendaProduto() + "';"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            fecharConexao();
        }
    }

    /**
     * Consulta produto por código.
     *
     * @param pIdVendaProduto
     * @return modelVenda
     */
    public ModelVendaProduto retornarVendaProdutoDAO(int pIdVendaProduto) {
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();

        try {
            conectar();
            executarSQL("SELECT "
                    + "pk_id_venda_produto, "
                    + "fk_produto, "
                    + "fk_venda, "
                    + "venda_produto_valor, "
                    + "venda_produto_quantidade "
                    + "FROM tbl_vendas_produtos WHERE pk_id_venda_produto = '" + pIdVendaProduto + "'");
            while (getResultSet().next()) {
                modelVendaProduto.setIdVendaProduto(getResultSet().getInt(1));
                modelVendaProduto.setProduto(getResultSet().getInt(2));
                modelVendaProduto.setVenda(getResultSet().getInt(3));
                modelVendaProduto.setVendaProdutoValor(getResultSet().getDouble(4));
                modelVendaProduto.setVendaProdutoQuantidade(getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        return modelVendaProduto;
    }

    /**
     * Retornar lista de vendas.
     *
     * @return listaModelVendas
     */
    public ArrayList<ModelVendaProduto> retornarListaVendaProdutoDAO() {
        ArrayList<ModelVendaProduto> listaModelVendaProdutos = new ArrayList<>();
        ModelVendaProduto modelVendaProduto = new ModelVendaProduto();
        try {
            conectar();
            executarSQL("SELECT pk_id_vendas, fk_cliente, venda_data, venda_valor_liquido, venda_valor_bruto, venda_desconto FROM tbl_vendas_produtos;");
            while (getResultSet().next()) {
                modelVendaProduto = new ModelVendaProduto();
                modelVendaProduto.setIdVendaProduto(getResultSet().getInt(1));
                modelVendaProduto.setProduto(getResultSet().getInt(2));
                modelVendaProduto.setVenda(getResultSet().getInt(3));
                modelVendaProduto.setVendaProdutoValor(getResultSet().getDouble(4));
                modelVendaProduto.setVendaProdutoQuantidade(getResultSet().getInt(5));
                listaModelVendaProdutos.add(modelVendaProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        return listaModelVendaProdutos;
    }

    /**
     * Salvar uma lista de produtos de uma venda.
     *
     * @param pListaModelVendasProdutos
     * @return
     */
    public boolean salvarVendaProdutoDAO(ArrayList<ModelVendaProduto> pListaModelVendasProdutos) {
        try {
            conectar();
            int linhas = pListaModelVendasProdutos.size();
            for (int i = 0; i < linhas; i++) {
                this.insertSQL("INSERT INTO tbl_vendas_produtos ("
                        + "fk_venda,"
                        + "fk_produto,"
                        + "venda_produto_valor,"
                        + "venda_produto_quantidade"
                        + ") VALUES ("
                        + "'" + pListaModelVendasProdutos.get(i).getVenda() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getProduto() + "',"        
                        + "'" + pListaModelVendasProdutos.get(i).getVendaProdutoValor() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getVendaProdutoQuantidade() + "'"
                        + ");");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            fecharConexao();
        }
    }

}
