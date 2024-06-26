package com.br.pix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/key")
public class ReadKeyPix {

    @GetMapping("/findAllKey")
    public String getFindAllById() {
        return new String("aqui vamos consultar todas as chaves por um ID do usuario");
    }
    
}
