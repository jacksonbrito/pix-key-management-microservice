package com.br.pix.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/key")
public class DeleteKeyPix {

    @DeleteMapping("/deleteKey")
    public String postCreateKeyCPF() {
        return new String("aqui vamos deletar as chaves pix.");
    }
    
}
