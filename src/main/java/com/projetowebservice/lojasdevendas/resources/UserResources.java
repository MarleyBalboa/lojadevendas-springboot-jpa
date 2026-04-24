package com.projetowebservice.lojasdevendas.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

import com.projetowebservice.lojasdevendas.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Marley", "marleymlr@hotmail.com", "123456", "11996677");
        return ResponseEntity.ok().body(u);
    }
}
