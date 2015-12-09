/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.grupolinares.controller;

import com.pe.grupolinares.service.iface.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JLimachi
 */
@Controller
public class LoginController {

    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public UsuarioService usuarioService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView initLogin() {
        return new ModelAndView("login");
    }

}
