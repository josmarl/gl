package com.pe.grupolinares.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author william.calisaya
 */
@Controller
public class FacturaController {
    public final Logger logger = LoggerFactory.getLogger(this.getClass());
    
@RequestMapping (value = "/factura", method = RequestMethod.GET)
public ModelAndView viewFactura(){
    return new ModelAndView("factura");
}
}
