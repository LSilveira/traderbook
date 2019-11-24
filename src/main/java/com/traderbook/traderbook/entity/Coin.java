package com.traderbook.traderbook.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Embeddable
public class Coin implements Serializable
{
    private static final long serialVersionUID = -391768588590086727L;

    @Enumerated(EnumType.STRING)
    private CoinSymbol symbol;

    private BigDecimal value;
}
