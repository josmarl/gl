/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.grupolinares.dao.iface;

import java.util.List;
import com.pe.grupolinares.model.Usuario;

/**
 *
 * @author JLimachi
 */
public interface UsuarioDao {

    List<Usuario> listUsuario();

    public void save(Usuario usuario);

}
