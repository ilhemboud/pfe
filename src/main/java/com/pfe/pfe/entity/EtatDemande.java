package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "etat_demande")

public class EtatDemande {
    @Id
    @Column(name="id_etat")
    private int idEtat;

    @Column(name="libelle_etat")
    private String libelleEtat;

    
}
