package com.pfe.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pfe.entity.RoleEmploye;
import com.pfe.pfe.entity.RoleEmployeId;
import com.pfe.pfe.repository.RoleEmployeRepository;

@Service
public class RoleEmployeService {
    @Autowired
    private RoleEmployeRepository roleEmployeRepository;

    public List<RoleEmploye> findAll(){
        return roleEmployeRepository.findAll();
    }

    public RoleEmploye findById(RoleEmployeId id){
        return roleEmployeRepository.findById(id).orElse(null);
    
    }

    public RoleEmploye save(RoleEmploye roleEmploye){
        return roleEmployeRepository.save(roleEmploye);
    }

    public void deleteById(RoleEmployeId id){
        roleEmployeRepository.deleteById(id);
    }
}
