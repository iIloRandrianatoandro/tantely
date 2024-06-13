package com.cod_eni.cod_eni.dao;

import com.cod_eni.cod_eni.entites.Cinema;
import com.cod_eni.cod_eni.entites.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SeanceRepositorie extends JpaRepository<Seance,Long> {
    
}
