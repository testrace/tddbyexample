package com.example.tddbyexample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DollarTest {

    @DisplayName("$5 X 2 = $10")
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(five.amount).isEqualTo(10);
        product = five.times(3);
        assertThat(five.amount).isEqualTo(15);
    }

}
