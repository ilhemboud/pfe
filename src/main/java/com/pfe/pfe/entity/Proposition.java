package com.pfe.pfe.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "proposition")

@Getter
@Setter
public class Proposition extends Demande { 

    @Column(name="type_proposition")
    private String typeProposition;
    
}
