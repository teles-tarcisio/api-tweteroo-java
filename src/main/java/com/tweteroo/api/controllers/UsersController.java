package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.models.User;
import com.tweteroo.api.repositories.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")

public class UsersController {
  @Autowired
  private UserRepository repository;

  @PostMapping("/sign-up")
  public void createUser(@RequestBody @Valid UserDTO req) {
    System.out.println( req.username() + ", " + req.avatar());

    //repository.save(new User(req));
  }

  @GetMapping("/sign-up")
  public String getAll() {
    return "sucesso -> getAll";
  }



  
}
