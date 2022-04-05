package com.bootcamp.debitcardservice.services;

import com.bootcamp.debitcardservice.documents.dto.ClientRequest;
import reactor.core.publisher.Mono;

public interface ClientRequestService {

  Mono<ClientRequest> getCustomer(String customerIdentityNumber);
}
