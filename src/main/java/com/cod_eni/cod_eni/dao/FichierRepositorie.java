package com.cod_eni.cod_eni.dao;

import com.cod_eni.cod_eni.entites.Demande;
import com.cod_eni.cod_eni.entites.Fichier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FichierRepositorie extends JpaRepository<Fichier,Long> {
}
