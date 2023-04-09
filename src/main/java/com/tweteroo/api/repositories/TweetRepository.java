package com.tweteroo.api.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.api.models.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
  Page<Tweet> findAll(Pageable tweetsPage);
  List<Tweet> findAllByUsername(String username, Sort ordering);

}