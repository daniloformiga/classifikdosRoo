package com.ufpb.repository;
import com.ufpb.domain.Anuncio;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Anuncio.class)
public interface AnuncioRepository {
}
