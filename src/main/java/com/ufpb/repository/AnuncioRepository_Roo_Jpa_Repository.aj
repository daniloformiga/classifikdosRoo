// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ufpb.repository;

import com.ufpb.domain.Anuncio;
import com.ufpb.repository.AnuncioRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect AnuncioRepository_Roo_Jpa_Repository {
    
    declare parents: AnuncioRepository extends JpaRepository<Anuncio, Long>;
    
    declare parents: AnuncioRepository extends JpaSpecificationExecutor<Anuncio>;
    
    declare @type: AnuncioRepository: @Repository;
    
}
