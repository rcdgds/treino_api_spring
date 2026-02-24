package com.rica.treino_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientController {

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Ola, primeira mensagem";
    }
}
