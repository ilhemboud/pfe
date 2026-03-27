package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ligne_type_demande")

public class LigneTypeDemande {
   
    @EmbeddedId
    private LigneTypeDemandeId ligneTypeDemandeId;

    @ManyToOne
    @JoinColumn(name="id_departement")
    private Departement departement;

    @ManyToOne
    @JoinColumn(name="id_type")
    private TypeDemande typeDemande;

}
