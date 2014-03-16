package com.ufpb.repository;
import com.ufpb.domain.Usuario;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Usuario.class)
public interface UsuarioRepository {
}
