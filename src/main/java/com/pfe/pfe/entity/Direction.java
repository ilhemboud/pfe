package com.pfe.pfe.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "direction")

@Getter
@Setter
public class Direction {
    @Id
    @Column(name="id_direction")
    private int idDirection;

     @Column(name="nom_direction")
    private String nomDirection;

     @Column(name="adresse_direction")
    private String adresseDirection;

     @Column(name="contact_direction")
    private String contactDirection;

    @ManyToOne
    @JoinColumn(name="id_directioncentrale")
    private DirectionCentrale directionCentrale;
    
}
