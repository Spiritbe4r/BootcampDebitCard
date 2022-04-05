package com.bootcamp.debitcardservice.services;

import com.bootcamp.debitcardservice.documents.entities.DebitCard;
import reactor.core.publisher.Mono;

public interface DebitCardService extends CrudService<DebitCard, String> {

  Mono<DebitCard> findByPan(String pan);

  Mono<DebitCard> findDebitCardByClient_ClientIdNumber(String customerIdentityNumber);
}
