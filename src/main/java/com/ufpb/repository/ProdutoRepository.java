package com.ufpb.repository;
import com.ufpb.domain.Produto;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Produto.class)
public interface ProdutoRepository {
}
