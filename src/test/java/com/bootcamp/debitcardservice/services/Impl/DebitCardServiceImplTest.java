package com.bootcamp.debitcardservice.services.Impl;

import com.bootcamp.debitcardservice.documents.entities.DebitCard;
import com.bootcamp.debitcardservice.repositories.DebitCardRepository;
import com.bootcamp.debitcardservice.util.DebitCardCreator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class DebitCardServiceImplTest {

    @InjectMocks
    DebitCardServiceImpl debitCardServiceImpl;

    @Mock
    DebitCardRepository debitCardRepositoryMock;

    private final DebitCard debitCard = DebitCardCreator.createValidDebitCard();

    @BeforeEach
    public void setUp() {

        BDDMockito.when(debitCardRepositoryMock.save(ArgumentMatchers.any(DebitCard.class)))
                .thenReturn(Mono.just(debitCard));

        BDDMockito.when(debitCardRepositoryMock.findAll())
                .thenReturn(Flux.just(debitCard));

        BDDMockito.when(debitCardRepositoryMock.findById(ArgumentMatchers.anyString()))
                .thenReturn(Mono.just(debitCard));

        BDDMockito.when(debitCardRepositoryMock.delete(ArgumentMatchers.any(DebitCard.class)))
                .thenReturn(Mono.empty());

        BDDMockito.when(debitCardRepositoryMock.findByPan(ArgumentMatchers.anyString()))
                .thenReturn(Mono.just(debitCard));

        BDDMockito.when(debitCardRepositoryMock
                        .findDebitCardByClient_ClientIdNumber(ArgumentMatchers.anyString()))
                .thenReturn(Mono.just(debitCard));

    }

    @Test
    void create() {
        DebitCard debitCardToBeSaved = DebitCardCreator.createDebitCardToBeSaved();

        StepVerifier.create(debitCardServiceImpl.create(debitCardToBeSaved))
            .expectSubscription()
                .expectNext(debitCard)
                .verifyComplete();
    }

    @Test
    void findAll() {
        StepVerifier.create(debitCardServiceImpl.findAll())
                .expectSubscription()
                .expectNext(debitCard)
                .verifyComplete();
    }

    @Test
    void findById() {
        StepVerifier.create(debitCardServiceImpl.findById("617ee981e22159302f88c777"))
                .expectSubscription()
                .expectNext(debitCard)
                .verifyComplete();
    }

    @Test
    void update() {
        StepVerifier.create(debitCardServiceImpl.update(debitCard))
                .expectSubscription()
                .expectNext(debitCard)
                .verifyComplete();
    }

    @Test
    void delete() {
        StepVerifier.create(debitCardServiceImpl.delete(debitCard))
                .expectSubscription()
                .verifyComplete();
    }

    @Test
    void findByPan() {
        StepVerifier.create(debitCardServiceImpl.findByPan("1234-1234-5678"))
                .expectSubscription()
                .expectNext(debitCard)
                .verifyComplete();
    }

    @Test
    void findDebitCardByCustomer_CustomerIdentityNumber() {
        StepVerifier.create(debitCardServiceImpl
                .findDebitCardByClient_ClientIdNumber("77380599"))
                .expectSubscription()
                .expectNext(debitCard)
                .verifyComplete();
    }
}