/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.grupolinares.dao.impl;

import com.pe.grupolinares.dao.iface.ClienteDao;
import com.pe.grupolinares.model.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 *
 * @author josmarl
 */
@Repository(value = "clienteDao")
public class ClienteDaoImpl implements ClienteDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Cliente> listCliente() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Cliente> list = session.createQuery("from Cliente").list();
        return list;
    }

}
