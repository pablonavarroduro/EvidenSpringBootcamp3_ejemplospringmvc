package com.eviden.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Troller {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		
		return "Formulariodeprueba";
		
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "Procesamientodeformulario";
	}
	
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		String nombre=request.getParameter("nombre");
		nombre +=" dice klk";
		String mensaje = "K l K tu dice " + nombre;
		modelo.addAttribute("mensajeClaro", mensaje);
		return "Procesamientodeformulario";
	}
}
