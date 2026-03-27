package com.pfe.pfe.entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "demande")
@Inheritance(strategy = InheritanceType.JOINED)

public class Demande {
    @Id
    @Column(name="id_demande")
    private int idDemande;

    @Column(name="date_demande")
    private Date dateDemande;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="id_util")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name="id_departement")
    private Departement departement;

}
