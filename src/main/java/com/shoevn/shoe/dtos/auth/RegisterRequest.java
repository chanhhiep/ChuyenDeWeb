package com.shoevn.shoe.dtos.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class RegisterRequest {

  @Email(message = "invalid email address")
  @NotNull(message = "Email is required")
  private String email;

  @NotNull(message = "Password is required")
  private String password;
  private String phone;

}
