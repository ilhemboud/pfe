package com.pfe.pfe.entity;


import java.io.Serializable;

import jakarta.persistence.*;

@Embeddable

public class DemandeEtatDetailId implements Serializable{
    
    @Column(name="id_demande")
    private int idDemande;

    @Column(name="id_etat")
    private int idEtat;
}
