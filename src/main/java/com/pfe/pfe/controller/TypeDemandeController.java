package com.pfe.pfe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.pfe.entity.TypeDemande;
import com.pfe.pfe.service.TypeDemandeService;

@RestController
@RequestMapping("/api/typeDemande")
public class TypeDemandeController {
    

    @Autowired
    private TypeDemandeService typeDemandeService;

    @GetMapping
    public List<TypeDemande> findAll(){
        return typeDemandeService.findAll();
    }

    @GetMapping("/{id}")
    public TypeDemande findById(@PathVariable int id){
        return typeDemandeService.findById(id);
    }

    @PostMapping
    public TypeDemande save(@RequestBody TypeDemande typeDemande){
        return typeDemandeService.save(typeDemande);
    }

    @PutMapping("/{id}")
    public TypeDemande update(@PathVariable int id, @RequestBody TypeDemande typeDemande){
        return typeDemandeService.save(typeDemande);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        typeDemandeService.deleteById(id);
    }


}
