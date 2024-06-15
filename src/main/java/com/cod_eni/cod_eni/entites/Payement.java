package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Payement implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double somme;
    private Date datePayement;
    private String reference;
    private String modePayement;
    private String nomUtilisateur;
    @OneToOne
    @JoinColumn(name = "idDemande",nullable = false)
    private Demande demande;

}
