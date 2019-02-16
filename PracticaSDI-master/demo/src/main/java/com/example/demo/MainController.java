package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Controlador principal.
 * Redirige las peticiones a diferentes vistas.
 */

@Controller
public class MainController 
{
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) 
    {
        model.put("message", "Solicitar un servicio");
        // Se debe devolver el nombre de la plantilla a la que se invoca !!
        return "login";
    }
    
    @RequestMapping("/usuario")
    public String vistaUsuario(Map<String, Object> model)
    {
    	model.put("message", "Vista del usuario");
    	return "cliente";
    }
    
    @RequestMapping("/profesional")
    public String vistaProfesional(Map<String, Object> model)
    {
    	model.put("message", "Vista del profesional");
    	return "profesional";
    }
}

