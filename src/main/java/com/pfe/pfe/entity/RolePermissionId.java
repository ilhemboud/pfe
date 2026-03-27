package com.pfe.pfe.entity;


import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable

public class RolePermissionId implements Serializable{
    @Column(name="id_role")
    private int idRole;

     @Column(name="id_permission")
    private int idPermission;
}
