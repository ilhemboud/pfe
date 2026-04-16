package com.pfe.pfe.entity;


    

    import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "metier")


@Getter
@Setter
public class metier {
  @Id
  @Column(name="id_metier")
  private int idmetier;

  @Column(name="libelle_metier")
  private String libellemetier;



}
