/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.contable.dao.iface;

import com.pe.contable.model.ContUsuario;
import java.util.List;

/**
 *
 * @author JLimachi
 */
public interface UsuarioDao {

    List<ContUsuario> listUsuario();

    void save(ContUsuario usuario);

    ContUsuario loginUsuario(ContUsuario usuario);

}
