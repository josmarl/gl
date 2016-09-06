/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.contable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pe.contable.dao.iface.UsuarioDao;
import com.pe.contable.model.ContUsuario;
import com.pe.contable.service.iface.UsuarioService;

/**
 *
 * @author JLimachi
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    @Transactional
    public List<ContUsuario> listUsuario() {
        return usuarioDao.listUsuario();
    }

    @Override
    @Transactional
    public void save(ContUsuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public ContUsuario loginUsuario(ContUsuario usuario) {
        return usuarioDao.loginUsuario(usuario);
    }

}
