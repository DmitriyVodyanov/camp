package com.kovalevskyi.academy.codingbootcamp.week2.day0;

import com.kovalevskyi.academy.codingbootcamp.week1.day0.Sorting;
import java.util.Comparator;

/**
 * isAsciiUppercase.
 */
public class MainPrintSortedParam {

  /**
   * askdyashdayhsdasodu.
   */
  public static void main(String[] args) {
    if (args == null || args.length == 0) {
      System.out.println("Please specify at least one argument!");
    }
    Comparator<String> comparator = Comparator.comparing(String::toString);
    Sorting.sort(args, comparator);
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
