package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Film implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String realisateur;
    private Date dateSortie;
    private double duree;
    private String photos;
    @OneToMany(mappedBy = "film")
    private Collection<Projection> projections;
    @ManyToOne
    private Cathegorie cathegorie;

}
