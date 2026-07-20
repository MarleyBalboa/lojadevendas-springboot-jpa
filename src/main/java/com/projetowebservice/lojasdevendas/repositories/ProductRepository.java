package com.projetowebservice.lojasdevendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.lojasdevendas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
