package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/calendary")
public class Calendary {

    @GetMapping
    public String calendary() {
        return "Objetivos da semana: Gestão Financeira, \n Eco Sistema Spring, \n Sessão com o Bem Estar \n e estudo " +
                "de caso.";
    }
}
