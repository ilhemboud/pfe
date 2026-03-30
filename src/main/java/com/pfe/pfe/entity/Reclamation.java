package com.pfe.pfe.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reclamation")

@Getter
@Setter

public class Reclamation extends Demande{
    @Column(name="type_reclamation")
    private String typeReclamation;

     @Column(name="niveau_urgence")
    private String niveauUrgence;


    
}
