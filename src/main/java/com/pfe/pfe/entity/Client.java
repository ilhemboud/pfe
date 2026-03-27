package com.pfe.pfe.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "client")

public class Client extends Utilisateur {

    @Column(name="adresse_client")
    private String adresseClient;

    @Column(name="code_postal")
    private int codePostal;

     @Column(name="type_client")
    private String typeClient;
    
}
