package com.pfe.pfe.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity

@Table(name = "utilisateur")

@Getter
@Setter

@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {
    @Id
    @Column(name="id_util")
    private int idUtil;

     @Column(name="prenom_util")
    private String prenomUtil;

  @Column(name="nom_util")
    private String nomUtil;

      @Column(name="num_tel")
    private int numTel;

      @Column(name="email_util")
    private String emailUtil;
    
      @Column(name="etat_compte")
    private String etatCompte;

    @Column(name="mot_de_passe")
    private String motDePasse;
   
}
