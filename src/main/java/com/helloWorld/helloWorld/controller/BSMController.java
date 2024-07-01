package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {

    @GetMapping
    public String bsm() {
        return "BSM's :\n" +
                "Mentalidade: Orientação ao futuro, Responsabilidade pessoal, Mentalidade de Crescimento e " +
                "Persistencia. \n\n" +
                "Habilidade: Trabalho em equipe, Atenção aos detalhes, proatividade e comunicação";
    }
}
