package com.pfe.pfe.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "reclamation")
public class Reclamation extends Demande{
    @Column(name="type_reclamation")
    private String typeReclamation;

     @Column(name="niveau_urgence")
    private String niveauUrgence;


    
}
