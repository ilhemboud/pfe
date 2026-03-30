package com.pfe.pfe.entity;


    

    import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tye_demande")


@Getter
@Setter
public class TypeDemande {
  @Id
  @Column(name="id_type")
  private int idType;

  @Column(name="libelle_type")
  private String libelleType;



}
