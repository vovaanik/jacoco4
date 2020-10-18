package ru.netology.statistic;

public class StatisticsService <array> {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax (long[] array) {
        long current_max = array[0];
        for (long income : array) {
            current_max = income;
        }
        return current_max;
    }
}
