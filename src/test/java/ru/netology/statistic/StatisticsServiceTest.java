package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



  class StatisticsServiceTest {
      StatisticsService service = new StatisticsService();


      @Test
      void findMax() {
          StatisticsService service = new StatisticsService();

          long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

          long expected = 12;
          long actual = service.findMax(incomesInBillions);

          assertEquals(expected, actual);
      }

      @Test
      void shouldGetCurrentMax() {
          long expected= 0;
          long actual = service.CurrentMax;
          assertEquals(expected, actual);
      }
      @Test
      void shouldGetIncome() {
          long expected = 0;
          long actual = service.Income;
          assertEquals(expected, actual);
      }
  }

  /*
  Calculate index of max income
 public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
*/
