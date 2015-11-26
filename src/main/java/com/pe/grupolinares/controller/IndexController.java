package com.pe.grupolinares.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pe.grupolinares.model.Usuario;
import com.pe.grupolinares.service.iface.UsuarioService;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	public final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UsuarioService service;
	
	List<Usuario> listaUsuarios;

	
	@RequestMapping(method = RequestMethod.GET)
	public String init(Model model) {
		//logger.info("init 2");
		listaUsuarios = service.listUsuario();
		model.addAttribute("usuarios", listaUsuarios);
		return "hello";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> getUsuarios() {
		//logger.info("getPersonas");
		return listaUsuarios;
	}
}
