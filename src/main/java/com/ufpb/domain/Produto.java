package com.ufpb.domain;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooJson(deepSerialize = true)
public class Produto {

    /**
     */
    @NotNull
    private String nome;

    /**
     */
    @ManyToOne
    private Usuario usuario;

    /**
     */
    @NotNull
    private String cor;

    /**
     */
    @NotNull
    private String tamanho;
}
