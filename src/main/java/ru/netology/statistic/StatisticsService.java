package ru.netology.statistic;

public class StatisticsService  {

    public long findMax (long[] array) {
        long current_max = array[0];
        for (long income : array) {
            current_max = income;
        }
        return current_max;
    }
}
