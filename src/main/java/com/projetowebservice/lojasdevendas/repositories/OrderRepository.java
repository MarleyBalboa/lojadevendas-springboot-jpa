package com.projetowebservice.lojasdevendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.lojasdevendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
