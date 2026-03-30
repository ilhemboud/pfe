package com.pfe.pfe.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "role")


@Getter
@Setter

public class Role {
    @Id
    @Column(name="id_role")
    private int idRole;

    @Column(name="nom_role")
    private String nomRole;

    @Column(name="description_role")
    private String descriptionRole;

}
