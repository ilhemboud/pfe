package com.pfe.pfe.entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "demande_etat_detail")

public class DemandeEtatDetail {

    @EmbeddedId
    private DemandeEtatDetailId demandeEtatDetailId;

    @Column(name="date_etat")
    private Date dateEtat;

    @ManyToOne
    @JoinColumn(name="id_demande")
    private Demande demande;
 
    @ManyToOne
    @JoinColumn(name="id_etat")
    private EtatDemande etatDemande;

}
