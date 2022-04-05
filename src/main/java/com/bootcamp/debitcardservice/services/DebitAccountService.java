package com.bootcamp.debitcardservice.services;

import com.bootcamp.debitcardservice.documents.dto.AccountRequest;
import com.bootcamp.debitcardservice.documents.dto.Pasive;
import reactor.core.publisher.Mono;

public interface DebitAccountService {

  Mono<AccountRequest> findByAccountNumber(String typeofdebit, String accountNumber);

  Mono<Pasive> getSavingAccount(String accountNumber);

  Mono<Pasive> getCurrentAccount(String accountNumber);

  Mono<Pasive> getFixedTermAccount(String accountNumber);

  Mono<AccountRequest> getAccountAmount(String typeofdebit, String accountNumber);

  Mono<Pasive> searchEspecificAccount(String pan, double amount, String passwd);
}
