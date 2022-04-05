package com.bootcamp.debitcardservice.documents.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountRequest {

  private String id;

  private double amount;

  private String clientIdNumber;

  private String typeOfAccount;

  private String accountNumber;
}
