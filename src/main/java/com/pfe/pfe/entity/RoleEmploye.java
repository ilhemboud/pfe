package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role_employe")

public class RoleEmploye {
    
    @EmbeddedId
    private RoleEmployeId roleEmployeId;

    @ManyToOne
    @JoinColumn(name="id_util")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name="id_role")
    private Role role;
}
