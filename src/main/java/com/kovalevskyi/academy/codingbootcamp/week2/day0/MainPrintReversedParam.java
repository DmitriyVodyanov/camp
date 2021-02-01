package com.kovalevskyi.academy.codingbootcamp.week2.day0;

/**
 * isAsciiUppercase.
 */
public class MainPrintReversedParam {

  /**
   * askdyashdayhsdasodu.
   */
  public static void main(String[] args) {
    if (args == null || args.length == 0) {
      System.out.println("Please specify at least one argument!");
    }
    for (int i = args.length - 1; i >= 0; i--) {
      System.out.println(args[i]);
    }
  }
}
