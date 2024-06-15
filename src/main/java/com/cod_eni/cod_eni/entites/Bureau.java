package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Bureau implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomBureau;
    private double longitude;
    private double latitude;
    private double altitude;
    private String type;
    @OneToMany(mappedBy = "bureau")
    private Collection<Setrouve> setrouves;
}
