package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString // annotation lombok
public class Cinema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longitude;
    private double latitude;
    private double altitude;
    private int nombreSalle;
    @OneToMany(mappedBy = "cinema")   // on utilise mapped by si la relation est bidirectionnelle
    private Collection<Salle> salles;
    @ManyToOne
    private Ville ville;
}
