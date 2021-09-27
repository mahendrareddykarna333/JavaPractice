package uk.control.structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculateSumOfTheDigits {


    @Test
    public void shouldCalculateSum() {
        Assertions.assertEquals(6,CalculateSumOfTheDigits.calculateSum(123));
        Assertions.assertEquals(15,CalculateSumOfTheDigits.calculateSum(12345));
        Assertions.assertEquals(0,CalculateSumOfTheDigits.calculateSum(0));
        Assertions.assertEquals(48,CalculateSumOfTheDigits.calculateSum(998877));
    }

}
