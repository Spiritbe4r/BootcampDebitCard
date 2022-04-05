package com.bootcamp.debitcardservice.repositories;

import com.bootcamp.debitcardservice.documents.entities.DebitCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface DebitCardRepository extends ReactiveMongoRepository<DebitCard, String> {

  Mono<DebitCard> findByPan(String pan);

  Mono<DebitCard> findDebitCardByClient_ClientIdNumber(String customerIdentityNumber);
}
