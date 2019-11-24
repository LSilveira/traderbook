package com.traderbook.traderbook.service;

import java.math.BigDecimal;

/**
 * Service to convert coin values
 */
public interface RateConversionService
{
    BigDecimal convert(BigDecimal rate);
}
