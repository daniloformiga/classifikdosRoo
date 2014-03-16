package com.ufpb.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooJson(deepSerialize = true)
public class Anuncio {

    /**
     */
    @ManyToOne
    private Produto produto;

    /**
     */
    @NotNull
    private String nome;

    /**
     */
    @NotNull
    private String descricao;

    /**
     */
    @NotNull
    private String valor;
}
