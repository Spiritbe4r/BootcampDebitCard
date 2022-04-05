package com.bootcamp.debitcardservice.documents.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientCommand {

  private String name;

  private String code;

  private String clientIdNumber;
}
