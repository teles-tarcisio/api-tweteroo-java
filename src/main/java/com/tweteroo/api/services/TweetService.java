package com.tweteroo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.models.Tweet;
import com.tweteroo.api.repositories.TweetRepository;

@Service
public class TweetService {
  @Autowired
  private TweetRepository tweetRepository;

  public void createTweet(TweetDTO data) {
    tweetRepository.save(new Tweet(data));
  }

  public List<Tweet> getAll() {
    return tweetRepository.findAll();
  }
  
}
