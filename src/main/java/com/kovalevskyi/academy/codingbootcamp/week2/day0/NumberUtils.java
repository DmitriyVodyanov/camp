package com.kovalevskyi.academy.codingbootcamp.week2.day0;

/**
 * isAsciiUppercase.
 */
public class NumberUtils {

  /**
   * isAsciiUppercase.
   */
  public static int getFactorial(final int number) {
    if (number < 0) {
      throw new IllegalArgumentException();
    }
    int factorial = 1;
    if (number == 0 || number == 1) {
      return factorial;
    }
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }
    return factorial;
  }

  /**
   * isAsciiUppercase.
   */
  public static int factorialRecursive(int number) {
    if (number < 0) {
      throw new IllegalArgumentException();
    }
    int result = 1;
    if (number == 0 || number == 1) {
      return result;
    }
    result = number * factorialRecursive(number - 1);
    return result;
  }

  /**
   * isAsciiUppercase.
   */
  public static long power(int base, int power) {
    if (power < 0) {
      throw new IllegalArgumentException();
    }
    long pow = 1;
    if (power == 0) {
      return pow;
    }
    for (int i = 1; i <= power; i++) {
      pow *= (long) base;
    }
    return pow;
  }

  /**
   * isAsciiUppercase.
   */
  public static int powerRecursive(int base, int power) {
    if (power < 0) {
      throw new IllegalArgumentException();
    }
    if (power == 0) {
      return 1;
    }
    if (power != 1) {
      return base * powerRecursive(base, power - 1);
    }
    return base;
  }

  /**
   * isAsciiUppercase.
   */
  public static int fibRecursive(int index) {
    if (index < 0) {
      throw new IllegalArgumentException();
    }
    if (index == 0) {
      return 0;
    }
    if (index == 1 || index == 2) {
      return 1;
    }
    return fibRecursive(index - 2) + fibRecursive(index - 1);
  }

  /**
   * isAsciiUppercase.
   */
  public static int[] fibSequence(int length) {
    if (length < 0) {
      throw new IllegalArgumentException();
    }
    int[] fibArray;
    if (length == 0) {
      return fibArray = new int[0];
    }
    fibArray = new int[length];
    if (length == 1) {
      fibArray[0] = 1;
      return fibArray;
    }
    fibArray[0] = 1;
    fibArray[1] = 1;
    for (int i = 2; i < fibArray.length; i++) {
      fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
    }

    return fibArray;
  }

  /**
   * isAsciiUppercase.
   */
  public static int sqrt(int target) {
    int result = -1;
    if (target < 1) {
      throw new IllegalArgumentException();
    }
    for (int i = 1; i < target; i++) {
      if (target / i == i) {
        result = i;
      }
    }
    return result;
  }

  /**
   * isAsciiUppercase.
   */
  public static boolean isPrime(int target) {
    if (target < 0) {
      throw new IllegalArgumentException();
    }
    if (target < 2) {
      return false;
    }
    for (int i = 2; i < target; i++) {
      if (target % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * isAsciiUppercase.
   */
  public static int findNextPrime(int target) {
    if (target < 0) {
      throw new IllegalArgumentException();
    }
    if (isPrime(target)) {
      return target;
    }
    while (!isPrime(target)) {
      target++;
      if (isPrime(target)) {
        return target;
      }
    }
    return target;
  }
}
