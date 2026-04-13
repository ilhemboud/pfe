package com.pfe.pfe.config;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.pfe.pfe.entity.Employe;
import com.pfe.pfe.repository.EmployeRepository;

@Component
public class DataInitializer {

    @Autowired
    private EmployeRepository employeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void init() {

        
        if (!employeRepository.existsByEmailUtil("admin@gmail.com")) {

            
            Employe admin = new Employe();

            
            admin.setNomUtil("Admin");
            admin.setPrenomUtil("Admin");
            admin.setEmailUtil("admin@gmail.com");
            admin.setMotDePasse(passwordEncoder.encode("admin123"));
            admin.setEtatCompte("ACTIF");
            admin.setNumTel(775320480);

            
            admin.setMatricule(0);
            admin.setAdmin(true);

            employeRepository.save(admin);

            System.out.println("✅ Admin créé avec succès !");
        } else {
            System.out.println("✅ Admin existe déjà !");
        }
    }
}