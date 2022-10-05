package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void sum_of_22_and_18_equals_40() {
        int a = 22;
        int b = 18;

        int sum = Sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(sum).as("sum of 22 + 18").isEqualTo(40);
    }

    @Test
    void multiplication_of_22_and_18_equals_396() {
        int a = 22;
        int b = 18;

        int multiplication = Sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(multiplication).as("multi of 22 * 18").isEqualTo(396);
    }
}
