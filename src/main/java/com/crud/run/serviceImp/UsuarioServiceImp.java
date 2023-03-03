package com.crud.run.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.run.dao.UsuarioDao;
import com.crud.run.model.Usuario;
import com.crud.run.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAll() {
		return usuarioDao.findAll();
	}

	@Override
	public void detete(Integer id) {
		usuarioDao.deleteById(id);
		
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	public void update(Usuario usuario) {
		usuarioDao.save(usuario);
		
	}

	@Override
	public Optional<Usuario> get(Integer id) {
		return usuarioDao.findById(id);
	}

}
