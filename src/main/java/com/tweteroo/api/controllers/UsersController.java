package com.tweteroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.models.MyUser;
import com.tweteroo.api.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/sign-up")
@CrossOrigin(origins = "*")

public class UsersController {
  @Autowired
  private UserService userService;

  @PostMapping @ResponseStatus(code = HttpStatus.CREATED)
  public void createUser(@RequestBody @Valid UserDTO req) {
    System.out.println( "User Created: " + req.username() + ", " + req.avatar());
    userService.createUser(req);
  }

  @GetMapping
  public List<MyUser> getAll() {
    return userService.getAll();
  }



  
}
