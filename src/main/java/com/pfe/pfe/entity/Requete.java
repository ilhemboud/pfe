package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "requete")

public class Requete extends Demande {
    
    @Column(name="type_requete")
    private String typeRequete;
}
