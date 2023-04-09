package com.tweteroo.api.models;

import com.tweteroo.api.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 128, nullable = false)
  private String username;

  @Column(length = 256, nullable = false)
  private String avatar;

  public User(UserDTO newUser) {
    this.username = newUser.username();
    this.avatar = newUser.avatar();    
  }
  
}