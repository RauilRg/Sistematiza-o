package com.sistematizacao.sistemati.controllers;


import com.sistematizacao.sistemati.Entregador.Entregador;
import com.sistematizacao.sistemati.repository.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entregadores")
public class MainController {

    @Autowired
    private EntregadorRepository entregadorRepository;

    @PostMapping
    public Entregador criarEntregador(@RequestBody Entregador entregador) {
        return entregadorRepository.save(entregador);
    }

    @GetMapping
    public List<Entregador> listarEntregadores() {
        return entregadorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entregador> detalhesEntregador(@PathVariable Long id) {
        return entregadorRepository.findById(id);
               
    }

    @PutMapping("/{id}")
    public Entregador atualizarEntregador(@RequestBody Entregador novoEntregador, @PathVariable Long id) {
        return entregadorRepository.findById(id)
                .map(entregador -> {
                    entregador.setCpf(novoEntregador.getCpf());
                    entregador.setNome(novoEntregador.getNome());
                    entregador.setCapacidadeVeiculo(novoEntregador.getCapacidadeVeiculo());
                    return entregadorRepository.save(entregador);
                })
                .orElseGet(() -> {
                    novoEntregador.setId(id);
                    return entregadorRepository.save(novoEntregador);
                });
    }

    @DeleteMapping("/{id}")
    public void deletarEntregador(@PathVariable Long id) {
        entregadorRepository.deleteById(id);
    }
}