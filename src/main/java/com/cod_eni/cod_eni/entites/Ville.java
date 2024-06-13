package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ville  implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomville;
    private double longitude , latitude , altitude;
    @OneToMany(mappedBy = "ville")
    private Collection<Cinema> cinemas;


}
