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

import com.pfe.pfe.entity.metier;
import com.pfe.pfe.service.metierService;

@RestController
@RequestMapping("/api/metiers")
public class metierController {
    

    @Autowired
    private metierService metierService;

    @GetMapping
    public List<metier> findAll(){
        return metierService.findAll();
    }

    @GetMapping("/{id}")
    public metier findById(@PathVariable int id){
        return metierService.findById(id);
    }

    @PostMapping
    public metier save(@RequestBody metier metier){
        return metierService.save(metier);
    }

    @PutMapping("/{id}")
    public metier update(@PathVariable int id, @RequestBody metier metier){
        return metierService.save(metier);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        metierService.deleteById(id);
    }


}
