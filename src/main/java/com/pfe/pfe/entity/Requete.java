package com.pfe.pfe.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "requete")

@Getter
@Setter

public class Requete extends Demande {
    
    @Column(name="type_requete")
    private String typeRequete;
}
