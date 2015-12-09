/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.grupolinares.service.impl;

import com.pe.grupolinares.dao.iface.ClienteDao;
import com.pe.grupolinares.model.Cliente;
import com.pe.grupolinares.service.iface.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author josmarl
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    public ClienteDao clienteDao;

    @Override
    @Transactional
    public List<Cliente> listCliente() {
        return clienteDao.listCliente();
    }

}
