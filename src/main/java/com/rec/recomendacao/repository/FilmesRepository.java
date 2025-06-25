package com.rec.recomendacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rec.recomendacao.model.Filmes;

public interface FilmesRepository extends JpaRepository<Filmes, Long> {
    List<Filmes> findByGenero(String genero);
    List<Filmes> findTop5ByOrderByNotaDesc();
}