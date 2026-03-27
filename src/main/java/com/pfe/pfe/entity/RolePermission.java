package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role_permission")

public class RolePermission {
    @EmbeddedId
    private RolePermissionId rolePermissionId;

    @ManyToOne
    @JoinColumn(name="id_role")
    private Role role;

    @ManyToOne
    @JoinColumn(name="id_permission")
    private Permission permission;
}
