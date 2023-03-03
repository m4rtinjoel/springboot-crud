package com.crud.run.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.run.model.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer>  {

}
