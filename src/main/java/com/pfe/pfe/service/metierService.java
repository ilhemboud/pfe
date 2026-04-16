package com.pfe.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pfe.entity.metier;
import com.pfe.pfe.repository.metierRepository;

@Service
public class metierService {
    @Autowired
    private metierRepository metierRepository;

    public List<metier> findAll(){
        return metierRepository.findAll();
    }

    public metier findById(int id){
        return metierRepository.findById(id).orElse(null);
    }

    public metier save(metier metier){
        return metierRepository.save(metier);
    }

    public void deleteById(int id){
        metierRepository.deleteById(id);
    }
}
