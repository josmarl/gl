package com.pe.grupolinares.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pe.grupolinares.model.Usuario;
import com.pe.grupolinares.service.iface.UsuarioService;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public UsuarioService usuarioService;

    @RequestMapping("/welcome")
    public String redirect() {
        return "welcome";
    }

    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public ModelAndView listaUsuarios(Model model) {
        model.addAttribute("usuario", new Usuario());
        return new ModelAndView("usuario");
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Usuario> getAll() {
        return usuarioService.listUsuario();
    }

    @RequestMapping("/usuario/add")
    @ResponseBody
    public void save(@RequestBody Usuario usuario) {
        this.usuarioService.save(usuario);
    }

}
