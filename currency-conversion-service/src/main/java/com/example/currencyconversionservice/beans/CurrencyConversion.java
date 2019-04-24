package com.example.currencyconversionservice.beans;

import java.math.BigDecimal;

public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private Integer quantity;
    private Integer totalCalculatedAmount;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id, String from, String to, BigDecimal conversionFactor, Integer quantity, Integer totalCalculatedAmount) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionFactor;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(Integer totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }
}
