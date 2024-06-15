package com.cod_eni.cod_eni.dao;

import com.cod_eni.cod_eni.entites.Notification;
import com.cod_eni.cod_eni.entites.Payement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PayementRepositorie extends JpaRepository<Payement,Long> {
}
