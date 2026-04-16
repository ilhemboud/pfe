package com.pfe.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pfe.entity.metier;

@Repository
public interface metierRepository extends JpaRepository<metier, Integer> {
    
}
