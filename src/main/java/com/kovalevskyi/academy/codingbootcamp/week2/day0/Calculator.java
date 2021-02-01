package com.kovalevskyi.academy.codingbootcamp.week2.day0;

import com.kovalevskyi.academy.codingbootcamp.week1.day1.StringUtils;
import com.kovalevskyi.academy.codingbootcamp.week1.day3.StdString2;

/**
 * isAsciiUppercase.
 */
public class Calculator {

  /**
   * askdyashdayhsdasodu.
   */
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Please provide 3 input arguments, example: 2 + 3");
      return;
    }

    char[] numA = stringToStdString2NumA(args);
    char[] operator = stringToStdString2Operator(args);
    char[] numB = stringToStdString2NumB(args);
    StdString2 numberA = new StdString2(numA);
    StdString2 mathOperator = new StdString2(operator);
    StdString2 numberB = new StdString2(numB);

    if (illegalArgument(numA) && illegalArgument(numB)) {
      throw new IllegalArgumentException();
    }

    if (illegalArgument(numA) || illegalArgument(numB)) {
      String result = "in: %s %s %s out: result: IllegalArgument";
      System.out.printf(result, numberA.toString(), mathOperator.charAt(0), numberB.toString());
      return;
    }

    calculate(numA, mathOperator, numB);


  }

  /**
   * askdyashdayhsdasodu.
   */
  private static void calculate(char[] numA, StdString2 mathOperator, char[] numB) {

    switch (mathOperator.charAt(0)) {
      case ('+'):
        long aSum = StringUtils.toInt(numA);
        long bSum = StringUtils.toInt(numB);
        long sum = aSum + bSum;
        System.out.println("result: " + sum);
        break;
      case ('-'):
        long aDiff = StringUtils.toInt(numA);
        long bDiff = StringUtils.toInt(numB);
        long diff = aDiff - bDiff;
        System.out.println("result: " + diff);
        break;
      case ('*'):
        long aCopmos = StringUtils.toInt(numA);
        long bCompos = StringUtils.toInt(numB);
        long composition = aCopmos * bCompos;
        System.out.println("result: " + composition);
        break;
      case ('/'):
        long aDiv = StringUtils.toInt(numA);
        long bDiv = StringUtils.toInt(numB);
        if (bDiv == 0) {
          System.out.println("Division by zero is impossible!");
          return;
        }
        long division = aDiv / bDiv;
//            String resultDivision = "result: %d";
        System.out.println("result: " + division);
        break;
      case ('%'):
        long aRemDiv = StringUtils.toInt(numA);
        long bRemDiv = StringUtils.toInt(numB);
        long remainsDiv = aRemDiv % bRemDiv;
        System.out.println("result: " + remainsDiv);
        break;
      default:
        throw new IllegalArgumentException();
    }
  }

  /**
   * askdyashdayhsdasodu.
   */
  private static char[] stringToStdString2NumA(String[] inputArray) {
    char[] numA = new char[inputArray[0].length()];
    for (int i = 0; i < numA.length; i++) {
      numA[i] = inputArray[0].charAt(i);
    }
    return numA;
  }

  /**
   * askdyashdayhsdasodu.
   */
  private static char[] stringToStdString2NumB(String[] inputArray) {
    char[] numB = new char[inputArray[2].length()];
    for (int i = 0; i < numB.length; i++) {
      numB[i] = inputArray[2].charAt(i);
    }
    return numB;
  }

  /**
   * askdyashdayhsdasodu.
   */
  private static char[] stringToStdString2Operator(String[] inputArray) {
    char[] numOperator = new char[inputArray[1].length()];
    for (int i = 0; i < numOperator.length; i++) {
      numOperator[i] = inputArray[1].charAt(i);
    }
    return numOperator;
  }

  /**
   * askdyashdayhsdasodu.
   */
  private static boolean illegalArgument(char[] numA) {
    boolean isIllegalArgument = false;
    for (char symbol : numA) {
      if (!StringUtils.isAsciiNumeric(symbol)) {
        if (symbol == '-') {
          continue;
        }
//        System.out.println("IllegalArgumentException");
        isIllegalArgument = true;
        break;
      }
    }
    return isIllegalArgument;
  }


}
