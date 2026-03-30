package com.pfe.pfe.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "role_employe")

@Getter
@Setter

public class RoleEmploye {
    
    @EmbeddedId
    private RoleEmployeId roleEmployeId;

    @ManyToOne
    @JoinColumn(name="id_util", insertable=false, updatable=false)
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name="id_role", insertable=false, updatable=false)
    private Role role;
}
