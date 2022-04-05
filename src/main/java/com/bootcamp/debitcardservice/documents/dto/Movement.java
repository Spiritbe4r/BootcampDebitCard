package com.bootcamp.debitcardservice.documents.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Movement {

  private String pan;

  private double amount;

  @NotNull
  @Size(min = 4, max = 4)
  private String password;
}
