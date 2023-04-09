package com.tweteroo.api.models;

import com.tweteroo.api.dto.TweetDTO;

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
public class Tweet {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 144, nullable = false)
  private String text;

  @Column(length = 128, nullable = false)
  private String username;

  @Column(length = 256, nullable = false)
  private String avatar;

  public Tweet(TweetDTO newTweet) {
    this.text = newTweet.text();
    this.username = newTweet.username();
    this.avatar = newTweet.avatar();
  }
  
}
