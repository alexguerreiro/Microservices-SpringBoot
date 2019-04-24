package com.example.currencyconversionservice.controller;

import com.example.currencyconversionservice.CurrencyExchangeServiceProxy;
import com.example.currencyconversionservice.beans.CurrencyConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion convertCurrency(@PathVariable String from, @PathVariable String to,
                                              @PathVariable Integer quantity){

        CurrencyConversion response = currencyExchangeServiceProxy.getExchangeValue(from, to);

        return new CurrencyConversion(response.getId(), from, to, response.getConversionMultiple(), quantity,
                response.getConversionMultiple().intValue() * quantity);
    }

}
