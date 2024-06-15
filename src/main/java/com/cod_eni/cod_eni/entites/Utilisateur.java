package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Utilisateur implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Date dateNaissance;
    private String nom;
    private String prenom;
    private String adresse;
    private String nomPere;
    private String nomMere;
    private String mdp;
    private double phone;
    private double cin;
    private String situationMatrimoniale;
    private String profession;
    private String photos;
    @OneToMany(mappedBy = "utilisateur")
    private Collection<Demande> demandes;


}
