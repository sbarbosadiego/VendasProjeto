/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelUsuario;

/**
 * @author Diego Barbosa da Silva
 */
public class DaoUsuario extends ConexaoMySql {

    /**
     * Inseri um usuario no banco de dados
     * @param pModelUsuarios
     * @return int
     */
    public int salvarUsuariosDAO(ModelUsuario pModelUsuarios) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_usuario ("
                    + "usuario_nome,"
                    + "usuario_login,"
                    + "usuario_senha"
                    + ") VALUES ("
                    + "'" + pModelUsuarios.getUsuarioNome() + "',"
                    + "'" + pModelUsuarios.getUsuarioLogin() + "',"
                    + "'" + pModelUsuarios.getUsuarioSenha() + "'"
                    + ");");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Exclui um usuario no banco de dados
     *
     * @param pIdUsuario
     * @return boolean
     */
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_usuario WHERE pk_id_usuario = '" + pIdUsuario + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Editar usuario
     *
     * @param pModelUsuarios
     * @return boolean
     */
    public boolean alterarUsuarioDAO(ModelUsuario pModelUsuarios) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_usuario SET "
                    + "usuario_nome = '" + pModelUsuarios.getUsuarioNome() + "',"
                    + "usuario_login = '" + pModelUsuarios.getUsuarioLogin() + "',"
                    + "usuario_senha = '" + pModelUsuarios.getUsuarioSenha() + "'"
                    + "WHERE pk_id_usuario = '" + pModelUsuarios.getIdUsuario() + "';"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Consulta de usuario por código
     *
     * @param pIdUsuario
     * @return modelUsuario
     */
    public ModelUsuario retornarUsuarioDAO(int pIdUsuario) {
        ModelUsuario modelUsuarios = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_usuario, "
                    + "usuario_nome, "
                    + "usuario_login "
                    + "FROM tbl_usuario WHERE pk_id_usuario = '" + pIdUsuario + "'");
            while (this.getResultSet().next()) {
                modelUsuarios.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuarioNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuarioLogin(this.getResultSet().getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuarios;
    }

    /**
     * Retornar lista de usuarios
     *
     * @return listaModelUsuarios
     */
    public ArrayList<ModelUsuario> retornarListaUsuariosDAO() {
        ArrayList<ModelUsuario> listaModelUsuarios = new ArrayList<>();
        ModelUsuario modelUsuarios = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_usuario, usuario_nome, usuario_login FROM tbl_usuario;");
            while (this.getResultSet().next()) {
                modelUsuarios = new ModelUsuario();
                modelUsuarios.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuarioNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuarioLogin(this.getResultSet().getString(3));
                listaModelUsuarios.add(modelUsuarios);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelUsuarios;
    }
    
    /**
     * Validar login de usuário.
     * @param pModelUsuario
     * @return boolean
     */
    public boolean getValidarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_usuario, "
                    + "usuario_nome, "
                    + "usuario_login "
                    + "FROM tbl_usuario WHERE usuario_login = '" + pModelUsuario.getUsuarioLogin() + "' "
                    + "AND usuario_senha = '" + pModelUsuario.getUsuarioSenha() + "';");
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
