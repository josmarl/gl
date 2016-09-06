/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.contable.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pe.contable.dao.iface.UsuarioDao;
import com.pe.contable.model.ContUsuario;

/**
 *
 * @author JLimachi
 */
@SuppressWarnings("unchecked")
@Repository(value = "usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<ContUsuario> listUsuario() {
        Session session = this.sessionFactory.getCurrentSession();
        List<ContUsuario> list = session.createQuery("from ContUsuario").list();
        return list;
    }

    @Override
    public void save(ContUsuario usuario) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(usuario);
    }

    @Override
    public ContUsuario loginUsuario(ContUsuario usuario) {
        Session session = this.sessionFactory.getCurrentSession();
        ContUsuario usuarioObj = (ContUsuario) session.createQuery("from ContUsuario u where u.login = ? and u.password = ?")
                .setParameter(0, usuario.getLogin())
                .setParameter(1, usuario.getPassword())
                .uniqueResult();
        return usuarioObj;
    }

}
