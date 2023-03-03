package com.crud.run.service;

import java.util.List;
import java.util.Optional;

import com.crud.run.model.Usuario;

public interface UsuarioService {
	public List<Usuario> findAll();
	public void detete(Integer id);
	public Usuario save(Usuario usuario);
	public void update(Usuario usuario);
	public Optional<Usuario> get(Integer id);
	
}
