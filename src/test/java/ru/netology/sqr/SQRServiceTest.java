package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculeteRangeOfSquaresOfNumbers() {
        SQRService service = new SQRService();

        int actual = service.calculete(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }
}