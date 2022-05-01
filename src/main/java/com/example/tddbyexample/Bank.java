package com.example.tddbyexample;

public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

}
