package com.bootcamp.debitcardservice.documents.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {

    private String name;

    private String clientIdNumber;

    private String clientIdType;

    private ClientType clientType;
}
