package com.rec.recomendacao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rec.recomendacao.model.Filmes;
import com.rec.recomendacao.repository.FilmesRepository;

@Service
public class RecomendacaoService {

    private final FilmesRepository repository;

    public RecomendacaoService(FilmesRepository repository) {
        this.repository = repository;
    }

    public List<Filmes> recomendarPorGenero(String genero) {
        return repository.findByGenero(genero);
    }

    public List<Filmes> recomendarMelhores() {
        return repository.findTop5ByOrderByNotaDesc();
    }
}