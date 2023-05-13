/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoUsuario;
import java.util.ArrayList;
import model.ModelUsuario;

/**
 * @author Diego Barbosa da Silva
 */
public class ControllerUsuario {

    private DaoUsuario daoUsuarios = new DaoUsuario();

    /**
     * Salvar usuario controller
     * @return int
     */
    public int salvarUsuarioController(ModelUsuario pModelUsuarios) {
        return this.daoUsuarios.salvarUsuariosDAO(pModelUsuarios);
    }

    /**
     * Excluir pelo código do usuario
     * @param pIdUsuario
     * @return boolean
     */
    public boolean excluirUsuarioController(int pIdUsuario) {
        return this.daoUsuarios.excluirUsuarioDAO(pIdUsuario);
    }

    /**
     * Editar um usuario
     * @param pModelUsuarios
     * @return boolean
     */
    public boolean editarUsuarioController(ModelUsuario pModelUsuarios) {
        return this.daoUsuarios.alterarUsuarioDAO(pModelUsuarios);
    }

    /**
     * Retornar pelo código de usuario
     * @param pIdUsuario
     * @return ModelUsuario
     */
    public ModelUsuario retornarUsuarioController(int pIdUsuario) {
        return this.daoUsuarios.retornarUsuarioDAO(pIdUsuario);
    }

    /**
     * Retornar lista de usuarios
     * @return ArrayList
     */
    public ArrayList<ModelUsuario> retornaListaUsuariosController() {
        return this.daoUsuarios.retornarListaUsuariosDAO();
    }
    
    /**
     * Validar login de usuário.
     * @param pmodelUsuario
     * @return 
     */
    public boolean getUsuarioController(ModelUsuario pmodelUsuario) {
        return this.daoUsuarios.getValidarUsuarioDAO(pmodelUsuario);
    }

}
