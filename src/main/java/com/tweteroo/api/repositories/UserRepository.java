package com.tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.api.models.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {
  
}