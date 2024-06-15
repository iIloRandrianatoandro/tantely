package com.cod_eni.cod_eni.dao;

import com.cod_eni.cod_eni.entites.Bureau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BureauRepositorie extends JpaRepository<Bureau,Long> {
}
