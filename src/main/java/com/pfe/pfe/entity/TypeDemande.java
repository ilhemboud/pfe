package com.pfe.pfe.entity;


    

    import jakarta.persistence.*;

@Entity
@Table(name = "tye_demande")

public class TypeDemande {
  @Id
  @Column(name="id_type")
  private int idType;

  @Column(name="libelle_type")
  private String libelleType;



}
