package com.bootcamp.debitcardservice.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CrudService<T, ID> {

  Mono<T> create(T obj);

  Flux<T> findAll();

  Mono<T> findById(ID id);

  Mono<T> update(T obj);

  Mono<Void> delete(T obj);
}
