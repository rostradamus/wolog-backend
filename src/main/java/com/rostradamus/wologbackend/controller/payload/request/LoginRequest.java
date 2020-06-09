package com.rostradamus.wologbackend.controller.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest {
  private String email;
  private String password;
}
