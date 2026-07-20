package com.projetowebservice.lojasdevendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.lojasdevendas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
