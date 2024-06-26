package com.br.pix.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/key")
public class CreateKeyPix {

    @PostMapping("/createKeyCPF")
    public String postCreateKeyCPF() {
        return new String("aqui vamos criar todas as chaves pix do tipo CPF por um ID do usuario");
    }
    
}
