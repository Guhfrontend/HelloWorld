package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("helloworld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/bsm")
    public String bsm() {
        return "BSM's :\n" +
                "Mentalidade: Orientação ao futuro, Responsabilidade pessoal, Mentalidade de Crescimento e " +
                "Persistencia. \n\n" +
                "Habilidade: Trabalho em equipe, Atenção aos detalhes, proatividade e comunicação";
    }

    @GetMapping("/calendary")
    public String calendary() {
        return "Objetivos da semana: Gestão Financeira, \n Eco Sistema Spring, \n Sessão com o Bem Estar \n e estudo de caso.";
    }
}
