package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Demande implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDemande;
    private Date dateDemande;
    @ManyToOne
    private Utilisateur utilisateur;
    @OneToOne(mappedBy = "demande")
    private Payement payement;
    @OneToMany (mappedBy = "demande")
    private Collection<Notification> notifications;
    @OneToMany(mappedBy = "demande")
    private Collection<Fichier> fichiers;
    @OneToMany(mappedBy = "demande")
    private Collection<Lier> liers;

}
