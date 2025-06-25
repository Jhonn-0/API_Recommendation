package com.rec.recomendacao.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rec.recomendacao.model.Filmes;
import com.rec.recomendacao.service.RecomendacaoService;

@RestController
@RequestMapping("/api/recomendacoes")
public class RecomendacaoController {

    private final RecomendacaoService service;

    public RecomendacaoController(RecomendacaoService service) {
        this.service = service;
    }

    @GetMapping("/genero/{genero}")
    public List<Filmes> recomendarPorGenero(@PathVariable String genero) {
        return service.recomendarPorGenero(genero);
    }

    @GetMapping("/melhores")
    public List<Filmes> recomendarMelhores() {
        return service.recomendarMelhores();
    }
}