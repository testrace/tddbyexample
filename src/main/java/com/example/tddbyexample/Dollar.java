package com.example.tddbyexample;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return "USD";
    }
}
