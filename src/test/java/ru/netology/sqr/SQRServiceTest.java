package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    void shouldCalculateRangeOfSquaresOfNumbers() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }
}