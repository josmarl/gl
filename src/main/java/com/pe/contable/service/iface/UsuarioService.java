/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.contable.service.iface;

import java.util.List;
import com.pe.contable.model.ContUsuario;

/**
 *
 * @author JLimachi
 */
public interface UsuarioService {

    List<ContUsuario> listUsuario();
    
    void save(ContUsuario usuario);
    
    ContUsuario loginUsuario(ContUsuario usuario);

}
