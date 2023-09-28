package com.midominio.dao;

import com.midominio.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
  Usuario findByUsername(String username);
}
