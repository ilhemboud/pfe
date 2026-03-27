package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "proposition")

public class Proposition extends Demande { 

    @Column(name="type_proposition")
    private String typeProposition;
    
}
