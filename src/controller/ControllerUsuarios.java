/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoUsuarios;
import java.util.ArrayList;
import model.ModelUsuarios;

/**
 * @author Diego Barbosa
 */
public class ControllerUsuarios {

    private DaoUsuarios daoUsuarios = new DaoUsuarios();

    /**
     * Salvar usuario controller
     * @return int
     */
    public int salvarUsuarioController(ModelUsuarios pModelUsuarios) {
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
    public boolean editarUsuarioController(ModelUsuarios pModelUsuarios) {
        return this.daoUsuarios.alterarUsuarioDAO(pModelUsuarios);
    }

    /**
     * Retornar pelo código de usuario
     * @param pIdUsuario
     * @return ModelUsuarios
     */
    public ModelUsuarios retornarUsuarioController(int pIdUsuario) {
        return this.daoUsuarios.retornarUsuarioDAO(pIdUsuario);
    }

    /**
     * Retornar lista de usuarios
     * @return ArrayList
     */
    public ArrayList<ModelUsuarios> retornaListaUsuariosController() {
        return this.daoUsuarios.retornarListaUsuariosDAO();
    }
    
    /**
     * Validar login de usuário.
     * @param pmodelUsuario
     * @return 
     */
    public boolean getUsuarioController(ModelUsuarios pmodelUsuario) {
        return this.daoUsuarios.getValidarUsuarioDAO(pmodelUsuario);
    }

}
