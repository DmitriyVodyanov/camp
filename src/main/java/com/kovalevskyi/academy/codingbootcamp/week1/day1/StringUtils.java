package com.kovalevskyi.academy.codingbootcamp.week1.day1;

/**
 * StdString1.
 */
public class StringUtils {

  /**
   * isAsciiUppercase.
   */
  public static boolean isAsciiUppercase(char ch) {
    illegalArgument(ch);
    return (ch >= 'A' && ch <= 'Z');
  }

  /**
   * isAsciiUppercase.
   */
  public static boolean isAsciiLowercase(char ch) {
    illegalArgument(ch);
    return (ch >= 'a' && ch <= 'z');
  }

  /**
   * isAsciiUppercase.
   */
  public static boolean isAsciiNumeric(char ch) {
    illegalArgument(ch);
    return  (ch >= '0' && ch <= '9');
  }

  /**
   * isAsciiUppercase.
   */
  public static boolean isAsciiAlphabetic(char ch) {
    return (isAsciiLowercase(ch) || isAsciiUppercase(ch));
  }

  /**
   * isAsciiUppercase.
   */
  public static char toAsciiUppercase(char ch) {
    if (!isAsciiLowercase(ch) || isAsciiNumeric(ch)) {
      return ch;
    }

    char upperChar = (char) (ch - 32);
    return upperChar;
  }

  /**
   * isAsciiUppercase.
   */
  public static char toAsciiLowercase(char ch) {
    if (!isAsciiUppercase(ch) || isAsciiNumeric(ch)) {
      return ch;
    }
    char lowerChar = (char) (ch + 32);
    return lowerChar;
  }

  /**
   * isAsciiUppercase.
   */
  public static StringBuilder makeUppercase(char[] input) {
    if (input == null) {
      throw new NullPointerException();
    }
    StringBuilder upperCaseStr = new StringBuilder();
    for (char symbol : input) {
      if (isAsciiLowercase(symbol)) {
        upperCaseStr.append((toAsciiUppercase(symbol)));
      }
      if (!isAsciiLowercase(symbol)) {
        upperCaseStr.append(symbol);
      }
    }
    return upperCaseStr;
  }

  /**
   * isAsciiUppercase.
   */
  public static StringBuilder makeLowercase(char[] input) {
    if (input == null) {
      throw new NullPointerException();
    }
    if (input.length == 0) {
      throw new IllegalArgumentException();
    }
    StringBuilder lowerCaseStr = new StringBuilder();
    for (char symbol : input) {
      if (isAsciiUppercase(symbol)) {
        lowerCaseStr.append(toAsciiLowercase(symbol));
      }
      if (!isAsciiUppercase(symbol)) {
        lowerCaseStr.append(symbol);
      }
    }
    return lowerCaseStr;
  }

  /**
   * isAsciiUppercase.
   */
  public static StringBuilder makeCamel(char[] input) {
    if (input == null) {
      throw new NullPointerException();
    }
    StringBuilder camelCaseStr = new StringBuilder();
    for (int i = 0; i < input.length; i++) {
      if (i % 2 == 0) {
        if (!isAsciiUppercase(input[i])) {
          camelCaseStr.append(input[i]);
        }
        if (isAsciiUppercase(input[i])) {
          camelCaseStr.append(toAsciiLowercase(input[i]));
        }
      }
      if (i % 2 != 0) {
        if (!isAsciiLowercase(input[i])) {
          camelCaseStr.append(input[i]);
        }
        if (isAsciiLowercase(input[i])) {
          camelCaseStr.append(toAsciiUppercase(input[i]));
        }
      }
    }
    return camelCaseStr;
  }

  /**
   * isAsciiUppercase.
   */
  public static boolean isStringAlphaNumerical(char[] input) {
    if (input == null) {
      throw new NullPointerException();
    }
    boolean checkStringAlphaNum = false;
    for (int i = 0; i < input.length; i++) {
      if (isAsciiNumeric(input[i]) || isAsciiAlphabetic(input[i]) || input[i] == ' ') {
        checkStringAlphaNum = true;
      } else {
        return checkStringAlphaNum = false;
      }
    }
    return checkStringAlphaNum;
  }

  /**
   * isAsciiUppercase.
   */
  public static char[] concatStrings(char[][] input) {
    if (input == null) {
      throw new NullPointerException();
    }
    StringBuilder stringBuilder = new StringBuilder();
    for (char[] tmp : input) {
      for (char ch : tmp) {
        stringBuilder.append(ch);
      }


      
    }
    char[] twoJoinArray = new char[stringBuilder.length()];
    for (int i = 0; i < twoJoinArray.length; i++) {
      twoJoinArray[i] = stringBuilder.charAt(i);
    }
    return twoJoinArray;
  }

  /**
   * isAsciiUppercase.
   */
  public static int toInt(char[] input) {
    if (input == null) {
      throw new NullPointerException();
    }
    int numberResult = 0;
    int isNegative = 1;
    for (int i = 0; i < input.length; i++) {
      if (isAsciiAlphabetic(input[i])) {
        throw new NumberFormatException();
      }
      if (isAsciiNumeric(input[i])) {
        int digit = (int) (input[i] - '0');
        numberResult *= 10;
        numberResult += digit;
        if (input[0] == '-') {
          isNegative  = -1;
        }
      }
    }
    return numberResult * isNegative;
  }

  private static void illegalArgument(char ch) {
    if (ch > 255) {
      throw new IllegalArgumentException();
    }
  }
}
