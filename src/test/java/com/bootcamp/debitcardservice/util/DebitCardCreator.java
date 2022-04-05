package com.bootcamp.debitcardservice.util;

import com.bootcamp.debitcardservice.documents.dto.ClientCommand;
import com.bootcamp.debitcardservice.documents.entities.DebitCard;

public class DebitCardCreator {

    public static DebitCard createValidDebitCard(){
        ClientCommand c = new ClientCommand("Luis Castañeda", "TP-01", "77380599");
        return DebitCard.builder()
                .id("617ee981e22159302f88c777")
                .pan("1234-1234-5678")
                .cardType("")
                .cardBrand("VISA")
                .cvv("123")
                .password("1234")
                .accounts(null)
                .client(c)
                .build();
    }

    public static DebitCard createDebitCardToBeSaved(){
        ClientCommand c = new ClientCommand("Luis Castañeda", "TP-01", "77380599");
        return DebitCard.builder()
                .pan("1234-1234-5678")
                .cardType("")
                .cardBrand("VISA")
                .cvv("123")
                .password("1234")
                .accounts(null)
                .client(c)
                .build();
    }
}
