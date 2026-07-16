// CORRETO:
package com.projetowebservice.lojasdevendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.lojasdevendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}