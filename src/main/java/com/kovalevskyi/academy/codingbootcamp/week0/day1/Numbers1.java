package com.kovalevskyi.academy.codingbootcamp.week0.day1;

/**
 * addNumberDontPositiveToArray.
 */
public class Numbers1 {

  /**
   * generateNumbers.
   */
  public static int[] generateNumbers() {
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }
    return array;
  }

  /**
   * generateNumbers.
   */
  public static int findBiggest(int left, int right) {
    if (left > right) {
      return left;
    } else {
      return right;
    }
  }

  /**
   * generateNumbers triple number.
   */
  public static int findBiggest(int left, int mid, int right) {
    return findBiggest(findBiggest(left, mid), right);
  }

  /**
   * findBiggest number array.
   */
  public static int findBiggest(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException();
    }
    if (numbers.length == 1) {
      return numbers[0];
    }
    int max = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (max < numbers[i]) {
        max = numbers[i];
      }
    }
    return max;
  }

  /**
   * findIndexOfBiggestNumber.
   */
  public static int findIndexOfBiggestNumber(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException();
    }
    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (max < numbers[i]) {
        max = numbers[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  /**
   * isNegative.
   */
  public static boolean isNegative(int number) {
    return number < 0;
  }

  /**
   * convertToCharArray.
   */
  public static char[] convertToCharArray(int number) {
    char[] arrayChar = new char[addNumberPositiveToArray(number).length];
    if (number < 0) {
      number *= -1;
      arrayChar = addNumberDontPositiveToArray(number);
    } else {
      return addNumberPositiveToArray(number);
    }
    return arrayChar;
  }

  /**
   * getCountsOfDigits.
   */
  private static int getCountsOfDigits(int number) {
    int count = (number == 0) ? 1 : 0;
    while (number != 0) {
      count++;
      number /= 10;
    }
    return count;
  }

  /**
   * addNumberPositiveToArray.
   */
  private static char[] addNumberPositiveToArray(int number) {
    int lengthArray = getCountsOfDigits(number);
    char[] arrayChar = new char[lengthArray];
    int tmp = 0;
    for (int i = arrayChar.length - 1; i >= 0; i--) {
      tmp = number % 10;
      arrayChar[i] = (char) ((tmp) + '0');
      number /= 10;
    }
    return arrayChar;
  }

  /**
   * addNumberDontPositiveToArray.
   */
  private static char[] addNumberDontPositiveToArray(int number) {
    int lengthArray = getCountsOfDigits(number);
    char[] arrayChar = new char[lengthArray + 1];
    int tmp = 0;
    for (int i = arrayChar.length - 1; i >= 0; i--) {
      tmp = number % 10;
      arrayChar[i] = (char) ((tmp) + '0');
      number /= 10;
      arrayChar[0] = '-';
    }
    return arrayChar;
  }
}
