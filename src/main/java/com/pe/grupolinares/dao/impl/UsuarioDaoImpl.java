/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.grupolinares.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pe.grupolinares.dao.iface.UsuarioDao;
import com.pe.grupolinares.model.Usuario;

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
    public List<Usuario> listUsuario() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Usuario> list = session.createQuery("from Usuario").list();
        return list;
    }
    
    @Override
    public void save(Usuario usuario){
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(usuario);
    }

}
