package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ligne_type_demande")

public class LigneTypeDemande {
   
    @EmbeddedId
    private LigneTypeDemandeId ligneTypeDemandeId;

    @ManyToOne
    @JoinColumn(name="id_departement", insertable=false, updatable=false)
    private Departement departement;

    @ManyToOne
    @JoinColumn(name="id_type", insertable=false, updatable=false)
    private TypeDemande typeDemande;

}
