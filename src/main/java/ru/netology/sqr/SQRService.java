package ru.netology.sqr;

public class SQRService {
    public int calculate (int bottom, int top) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr < bottom) {
                continue;
            }
            if (sqr > top) {
                continue;
            }
            count++;
        }
        return count;
    }
}
