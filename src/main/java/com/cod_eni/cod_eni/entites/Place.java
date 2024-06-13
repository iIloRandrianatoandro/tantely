package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Place implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numPlace;
    private double longitude , latitude , altitude ;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "place")
    private Collection<Ticket> tickets;
}
