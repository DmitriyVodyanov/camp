package com.kovalevskyi.academy.codingbootcamp.week0.day2;

import com.kovalevskyi.academy.codingbootcamp.week0.day1.Numbers1;

/**
   * sort.
   */
public class Numbers2 extends Numbers1 {

  /**
   * sort.
   */
  public static void sort(int[] target) {
    if (target == null) {
      return;
    }
    int tmp = 0;
    for (int i = target.length - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        if (target[j] > target[j + 1]) {
          tmp = target[j];
          target[j] = target[j + 1];
          target[j + 1] = tmp;
        }
      }
    }
  }

  /**
   * getFactorial.
   */
  public static int getFactorial(final int number) {
    if (number < 0) {
      throw new IllegalArgumentException();
    }
    int factorial = 1;
    if (number == 0) {
      return factorial;
    }
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }
    return factorial;
  }

  /**
   * generateTriplets.
   */
  public static char[][] generateTriplets() {
    char[][] ch = new char[81][3];
    char a = '0';
    for (int i = 0; i < 81; i++) {
      for (int j = 0; j < 3; j++) {
        ch[i][j] = a;
        a++;
      }
    }
    return ch;
  }

  /**
   * generateTuples.
   */
  public static char[][] generateTuples() {
    char[][] ch = new char['a']['a'];
    return ch;
  }

  /**
   * generateTuples.
   */
  public static char[][] generateTuples(int amount) {
    char[][] ch = new char['a']['a'];
    return ch;
  }
}
