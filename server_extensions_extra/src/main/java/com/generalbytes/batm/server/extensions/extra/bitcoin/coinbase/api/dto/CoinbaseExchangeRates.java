/*************************************************************************************
 * Copyright (C) 2014-2025 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/
package com.generalbytes.batm.server.extensions.extra.bitcoin.coinbase.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Holds exchange rates between a fiat currency and all available cryptocurrencies.
 */
public class CoinbaseExchangeRates {

    @JsonProperty("currency")
    private String fiatCurrency;
    @JsonProperty("rates")
    private Map<String, BigDecimal> ratesPerCryptocurrency;

    public String getFiatCurrency() {
        return fiatCurrency;
    }

    public void setFiatCurrency(String fiatCurrency) {
        this.fiatCurrency = fiatCurrency;
    }

    public Map<String, BigDecimal> getRatesPerCryptocurrency() {
        return ratesPerCryptocurrency;
    }

    public void setRatesPerCryptocurrency(Map<String, BigDecimal> ratesPerCryptocurrency) {
        this.ratesPerCryptocurrency = ratesPerCryptocurrency;
    }
}
