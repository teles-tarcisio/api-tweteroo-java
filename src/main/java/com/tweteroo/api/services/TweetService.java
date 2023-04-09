package com.tweteroo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    return tweetRepository.findAll(
      Sort.by(
        Sort.Direction.DESC, "id"
      ));
  }

  public List<Tweet> getAllPages(int pageNumber) {
    int pageSize = 5;
    if (pageNumber <= 0) { pageNumber = 0; }

    Pageable selectedPage = PageRequest.of(pageNumber, pageSize, Sort.Direction.DESC, "id");
    
    return tweetRepository.findAll(selectedPage).getContent();
  }

  public List<Tweet> getByUsername(String user) {
    return tweetRepository.findAllByUsername(
      user,
      Sort.by(
        Sort.Direction.DESC, "id"
      ));
  }
  
}
