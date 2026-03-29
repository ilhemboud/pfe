package com.pfe.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pfe.entity.LigneTypeDemande;
import com.pfe.pfe.entity.LigneTypeDemandeId;
import com.pfe.pfe.repository.LigneTypeDemandeRepository;

@Service
public class LigneTypeDemandeService {
    @Autowired
    private LigneTypeDemandeRepository ligneTypeDemandeRepository;

    public List<LigneTypeDemande> findAll(){
        return ligneTypeDemandeRepository.findAll();

    }

    public LigneTypeDemande findById(LigneTypeDemandeId id){
        return ligneTypeDemandeRepository.findById(id).orElse(null);
    }

    public LigneTypeDemande save(LigneTypeDemande ligneTypeDemande){
        return ligneTypeDemandeRepository.save(ligneTypeDemande);
    }

    public void deleteById(LigneTypeDemandeId id){
        ligneTypeDemandeRepository.deleteById(id);
    }
}
