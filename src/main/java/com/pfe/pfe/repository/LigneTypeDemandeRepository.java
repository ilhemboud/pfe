package com.pfe.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pfe.entity.LigneTypeDemande;
import com.pfe.pfe.entity.LigneTypeDemandeId;

@Repository
public interface LigneTypeDemandeRepository extends JpaRepository<LigneTypeDemande, LigneTypeDemandeId> {
    
}
