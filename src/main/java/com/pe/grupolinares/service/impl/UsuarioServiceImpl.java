/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.grupolinares.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.grupolinares.dao.iface.UsuarioDao;
import com.pe.grupolinares.model.Usuario;
import com.pe.grupolinares.service.iface.UsuarioService;

/**
 *
 * @author JLimachi
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> listUsuario() {
        return usuarioDao.listUsuario();
    }

}
