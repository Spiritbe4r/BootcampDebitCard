package com.bootcamp.debitcardservice.services.Impl;

import com.bootcamp.debitcardservice.documents.dto.ClientRequest;
import com.bootcamp.debitcardservice.services.ClientRequestService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class ClientRequestServiceImpl implements ClientRequestService {

  private static final Logger log = LoggerFactory.getLogger(ClientRequestServiceImpl.class);

  private final WebClient webClient;

  @Override
  public Mono<ClientRequest> getCustomer(String clientIdNumber) {
    return webClient
          .get()
          .uri("/findClientCredit/{clientIdNumber}", clientIdNumber)
          .accept(MediaType.APPLICATION_JSON)
          .exchangeToMono(clientResponse -> clientResponse.bodyToMono(ClientRequest.class))
          .doOnNext(c -> log.info("Client response: {}", c.getName()));
  }
}
