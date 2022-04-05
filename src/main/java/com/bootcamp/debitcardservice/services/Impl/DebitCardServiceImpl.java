package com.bootcamp.debitcardservice.services.Impl;

import com.bootcamp.debitcardservice.documents.entities.DebitCard;
import com.bootcamp.debitcardservice.repositories.DebitCardRepository;
import com.bootcamp.debitcardservice.services.DebitCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DebitCardServiceImpl implements DebitCardService {

  @Autowired
  DebitCardRepository repository;

  @Override
  public Mono<DebitCard> create(DebitCard obj) {
    return repository.save(obj);
  }

  @Override
  public Flux<DebitCard> findAll() {
    return repository.findAll();
  }

  @Override
  public Mono<DebitCard> findById(String s) {
    return repository.findById(s);
  }

  @Override
  public Mono<DebitCard> update(DebitCard obj) {
    return repository.save(obj);
  }

  @Override
  public Mono<Void> delete(DebitCard obj) {
    return repository.delete(obj);
  }

  @Override
  public Mono<DebitCard> findByPan(String pan) {
    return repository.findByPan(pan);
  }

  @Override
  public Mono<DebitCard> findDebitCardByClient_ClientIdNumber(String customerIdentityNumber) {
    return repository.findDebitCardByClient_ClientIdNumber(customerIdentityNumber);
  }
}
