package com.traderbook.traderbook.entity;

public enum CoinSymbol
{
    DOLAR("$"),
    EURO("€"),
    POUND("£"),
    BITCOIN("BTC"),
    ETHER("ETH");

    private String symbol;

    CoinSymbol(String symbol)
    {
        this.symbol = symbol;
    }

    public String getSymbol()
    {
        return symbol;
    }
}
