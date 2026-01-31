package com.intuitive.teste.controller;

import com.intuitive.teste.model.Operador;
import com.intuitive.teste.repository.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/operador")
public class OperadorController {

    @Autowired
    private OperadorRepository repository;

    @GetMapping
    public List<Operador> buscar(@RequestParam(required = false) String busca) {
        if (busca != null && !busca.isEmpty()) {
            return repository.findByRazaoSocialContainingIgnoreCase(busca);
        } else {
            return repository.findAll();
        }
    }
}