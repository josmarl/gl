/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.grupolinares.controller;

import com.pe.grupolinares.model.Cliente;
import com.pe.grupolinares.model.Usuario;
import com.pe.grupolinares.service.iface.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author josmarl
 */
@Controller
public class ClienteController {
    
    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public ClienteService clienteService;

    @RequestMapping(value = "/clientes", method = RequestMethod.GET)
    public ModelAndView viewClientes(Model model) {
        model.addAttribute("usuario", new Usuario());
        return new ModelAndView("cliente");
    }

    @RequestMapping(value = "/getClientes", method = RequestMethod.GET)
    public @ResponseBody
    List<Cliente> getClientes() {
        return clienteService.listCliente();
    }
}
