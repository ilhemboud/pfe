package com.pfe.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pfe.entity.TypeDemande;
import com.pfe.pfe.repository.TypeDemandeRepository;

@Service
public class TypeDemandeService {
    @Autowired
    private TypeDemandeRepository typeDemandeRepository;

    public List<TypeDemande> findAll(){
        return typeDemandeRepository.findAll();
    }

    public TypeDemande findById(int id){
        return typeDemandeRepository.findById(id).orElse(null);
    }

    public TypeDemande save(TypeDemande typeDemande){
        return typeDemandeRepository.save(typeDemande);
    }

    public void deleteById(int id){
        typeDemandeRepository.deleteById(id);
    }
}
