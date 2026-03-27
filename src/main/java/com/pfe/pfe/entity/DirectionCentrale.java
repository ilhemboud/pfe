package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "direction_centrale")


public class DirectionCentrale {
    @Id
    @Column(name="id_directioncentrale")
    private int idDirectionCentrale;

    @Column(name="nom_directioncentrale")
    private String nomDirectionCentrale;

    @Column(name="adresse_directioncentrale")
    private String adresseDirectionCentrale;

    @Column(name="contact_directioncentrale")
    private String contactDirectionCentrale;

    @ManyToOne
    @JoinColumn(name="id_filiale")
    private Filiale filiale;
    
}
