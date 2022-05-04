package com.example.tddbyexample;

import java.util.Objects;

public class Pair {

    private String form;
    private String to;

    public Pair(String form, String to) {
        this.form = form;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return Objects.equals(form, pair.form) && Objects.equals(to, pair.to);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
