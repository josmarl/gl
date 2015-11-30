package com.pe.grupolinares.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pe.grupolinares.model.Usuario;
import com.pe.grupolinares.service.iface.UsuarioService;

@Controller
public class IndexController {

	public final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public UsuarioService usuarioService;

	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public String listaUsuarios(Model model) {
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("listaUsuarios", this.usuarioService.listUsuario());
		return "usuario";
	}

}
