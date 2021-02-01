package com.kovalevskyi.academy.codingbootcamp.week0.day1;

/**
 * sdfg sdfg sdfg sdf gsdf gsdf.
 */
public class Alphabet {

  /**
   * sdfg sdfg sdfg sdf gsdf gsdf.
   */
  public static char[] generateAlphabet() {
    char a = 97;
    char z = 122;
    int length = (int) ((z - a) + 1);
    char[] arrayAlphabet = new char[length];
    for (int i = 0; i < arrayAlphabet.length; i++) {
      arrayAlphabet[i] = a;
      a++;
    }
    return arrayAlphabet;
  }

  /**
   * lskhdflkahsdkjf.
   */
  public static char[] generateReversedAlphabet() {
    char a = 97;
    char z = 122;
    int length = (int) ((z - a) + 1);
    char[] arrayAlphabetRevers = new char[length];
    for (int i = 0; i < arrayAlphabetRevers.length; i++) {
      arrayAlphabetRevers[i] = z;
      z--;
    }
    return arrayAlphabetRevers;
  }
}
