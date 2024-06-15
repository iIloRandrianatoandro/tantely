package com.cod_eni.cod_eni.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Service implements Serializable {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "service")
    private Collection<Lier> liers;
    @OneToMany(mappedBy = "service")
    private Collection<Setrouve> setrouves;
    @OneToMany(mappedBy = "service")
    private Collection<Piece> pieces;

}
