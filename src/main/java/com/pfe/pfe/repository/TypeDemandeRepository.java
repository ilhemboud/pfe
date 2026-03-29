package com.pfe.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pfe.entity.TypeDemande;

@Repository
public interface TypeDemandeRepository extends JpaRepository<TypeDemande, Integer> {
    
}
