/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import model.ModelProdutos;

/**
 *
 * @author di_an
 */
public class DaoProdutos extends ConexaoMySql {
    
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto "
                    + "(produto_nome,"
                    + "produto_valor,"
                    + "produto_estoque,"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getProdutoNome() + "',"
                    + "'" + pModelProdutos.getProdutoValor() + "',"
                    + "'" + pModelProdutos.getProdutoEstoque()+ "'");
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        } 
    }
    
}
