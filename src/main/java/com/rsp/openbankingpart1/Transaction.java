package com.rsp.openbankingpart1;

import lombok.*;

import java.util.Currency;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Transaction {
    private int type;
    private int accountNumber;
    private Currency currency;
    private int amount;
    private String merchantName;
    private String merchantLogo;
}
