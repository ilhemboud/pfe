package com.pfe.pfe.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Loginresponse {
    private string token;

    public Loginresponse(string token){
        this.token = token;
    }
    
}
