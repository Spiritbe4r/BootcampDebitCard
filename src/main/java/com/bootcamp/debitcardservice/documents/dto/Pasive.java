package com.bootcamp.debitcardservice.documents.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pasive {

  private String id;

  private String typeOfAccount;

  private String accountNumber;

  private double amount;
}
