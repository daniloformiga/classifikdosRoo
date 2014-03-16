// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ufpb.domain;

import com.ufpb.domain.Produto;
import com.ufpb.domain.ProdutoDataOnDemand;
import com.ufpb.domain.UsuarioDataOnDemand;
import com.ufpb.repository.ProdutoRepository;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

privileged aspect ProdutoDataOnDemand_Roo_DataOnDemand {
    
    declare @type: ProdutoDataOnDemand: @Component;
    
    private Random ProdutoDataOnDemand.rnd = new SecureRandom();
    
    private List<Produto> ProdutoDataOnDemand.data;
    
    @Autowired
    UsuarioDataOnDemand ProdutoDataOnDemand.usuarioDataOnDemand;
    
    @Autowired
    ProdutoRepository ProdutoDataOnDemand.produtoRepository;
    
    public Produto ProdutoDataOnDemand.getNewTransientProduto(int index) {
        Produto obj = new Produto();
        setCor(obj, index);
        setNome(obj, index);
        setTamanho(obj, index);
        return obj;
    }
    
    public void ProdutoDataOnDemand.setCor(Produto obj, int index) {
        String cor = "cor_" + index;
        obj.setCor(cor);
    }
    
    public void ProdutoDataOnDemand.setNome(Produto obj, int index) {
        String nome = "nome_" + index;
        obj.setNome(nome);
    }
    
    public void ProdutoDataOnDemand.setTamanho(Produto obj, int index) {
        String tamanho = "tamanho_" + index;
        obj.setTamanho(tamanho);
    }
    
    public Produto ProdutoDataOnDemand.getSpecificProduto(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Produto obj = data.get(index);
        Long id = obj.getId();
        return produtoRepository.findOne(id);
    }
    
    public Produto ProdutoDataOnDemand.getRandomProduto() {
        init();
        Produto obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return produtoRepository.findOne(id);
    }
    
    public boolean ProdutoDataOnDemand.modifyProduto(Produto obj) {
        return false;
    }
    
    public void ProdutoDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = produtoRepository.findAll(new org.springframework.data.domain.PageRequest(from / to, to)).getContent();
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Produto' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Produto>();
        for (int i = 0; i < 10; i++) {
            Produto obj = getNewTransientProduto(i);
            try {
                produtoRepository.save(obj);
            } catch (final ConstraintViolationException e) {
                final StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    final ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getRootBean().getClass().getName()).append(".").append(cv.getPropertyPath()).append(": ").append(cv.getMessage()).append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
                }
                throw new IllegalStateException(msg.toString(), e);
            }
            produtoRepository.flush();
            data.add(obj);
        }
    }
    
}
