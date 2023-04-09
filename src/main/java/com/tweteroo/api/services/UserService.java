package com.tweteroo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.models.MyUser;
import com.tweteroo.api.repositories.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public List<MyUser> getAll() {
    return userRepository.findAll();
  }

  public void createUser(UserDTO newUser) {
    userRepository.save(new MyUser(newUser));
  }

  
}