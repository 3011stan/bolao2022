package com.stan.bolao.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelecaoRepository extends CrudRepository<SelecaoModel, Long> {
    
}
