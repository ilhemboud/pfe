package com.pfe.pfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role_permission")

public class RolePermission {
    @EmbeddedId
    private RolePermissionId rolePermissionId;

    @ManyToOne
    @JoinColumn(name="id_role", insertable=false, updatable=false)
    private Role role;

    @ManyToOne
    @JoinColumn(name="id_permission", insertable=false, updatable=false)
    private Permission permission;
}
