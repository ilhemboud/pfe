package com.pfe.pfe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pfe.entity.RoleEmploye;
import com.pfe.pfe.entity.RoleEmployeId;

@Repository
public interface RoleEmployeRepository extends JpaRepository<RoleEmploye, RoleEmployeId > {
    
}
