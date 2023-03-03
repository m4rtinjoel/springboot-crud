package com.crud.run.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.run.model.Usuario;
import com.crud.run.service.UsuarioService;

@Controller
@RequestMapping("/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;	
	
	private final Logger log=LoggerFactory.getLogger(UsuarioController.class); 
	
	@GetMapping("")
	public String listar(Model model) {
		model.addAttribute("usuarios",usuarioService.findAll());
		return "listar";
	}
	
	@GetMapping("/crear")
	public String mostrar() {
		return "agregar";
	}
	
	@PostMapping("/save")
	public String save(Usuario producto) {
		usuarioService.save(producto);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		usuarioService.detete(id);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String updateCarga(@PathVariable Integer id,Model model) {
		Usuario usuario=new Usuario();
		Optional<Usuario> optional=usuarioService.get(id);
		usuario=optional.get();	
		log.info("Usuario cargado: {}",usuario);
		model.addAttribute("usuario", usuario);
		return "editar";
	}
	
	@PostMapping("/update")
	public String update(Usuario usuario) {
		usuarioService.update(usuario);
		return "redirect:/";
	}
	
	
}
