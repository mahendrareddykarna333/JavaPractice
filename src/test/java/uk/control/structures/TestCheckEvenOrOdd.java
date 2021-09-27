package uk.control.structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckEvenOrOdd {


    @Test
    public void shouldCheckEvenAndOddNumbers() {
        Assertions.assertTrue(CheckEvenOrOdd.isEven(2));
        Assertions.assertFalse(CheckEvenOrOdd.isEven(3));
    }

}
