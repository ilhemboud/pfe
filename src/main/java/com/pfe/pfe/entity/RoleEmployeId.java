package com.pfe.pfe.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable

public class RoleEmployeId implements Serializable{
    @Column(name="id_util")
    private int idUtil;

    @Column(name="id_role")
    private int idRole;


}
