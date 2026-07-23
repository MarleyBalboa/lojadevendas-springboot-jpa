// CORRETO:
package com.projetowebservice.lojasdevendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.lojasdevendas.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}