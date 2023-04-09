package com.tweteroo.api.dto;

import jakarta.validation.constraints.NotBlank;

public record UserDTO(
  @NotBlank(message = "'username' deve ser preenchido")
  String username,

  @NotBlank(message = "'avatar' deve ser preenchido")
  String avatar
  ) {
  
}
