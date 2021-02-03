package com.kovalevskyi.academy.codingbootcamp.week2.day1;

import com.kovalevskyi.academy.codingbootcamp.week1.day1.StringUtils;

/**
 * askdyashdayhsdasodu.
 */
public class BoxGenerator {

  /**
   * askdyashdayhsdasodu.
   */
  public static void main(String[] args) {

    if (args.length != 4) {
      System.out.printf("Please provide 4 input arguments, current amount: %d\n", args.length);
      return;
    }
    char[] height = stringToCharWidth(args);
    char[] width = stringToCharHeight(args);
    char[] side = stringToCharSide(args);
    char[] angle = stringToCharAngle(args);

    for (int i = 0; i < height.length; i++) {
      if (!StringUtils.isAsciiNumeric(height[i])) {
        throw new IllegalArgumentException();
      }
    }
    for (int i = 0; i < width.length; i++) {
      if (!StringUtils.isAsciiNumeric(width[i])) {
        throw new IllegalArgumentException();
      }
    }
    if (StringUtils.toInt(height) < 0 || StringUtils.toInt(width) < 0) {
      throw new IllegalArgumentException();
    }
    if (side.length > 1 || angle.length > 1) {
      throw new IllegalArgumentException();
    }
    if (StringUtils.toInt(height) == 0 || StringUtils.toInt(width) == 0) {
      System.out.print("");
      return;
    }

    int heightNum = StringUtils.toInt(height);
    int widthNum = StringUtils.toInt(width);

    for (int i = 0; i < heightNum; i++) {
      for (int i2 = 0; i2 < widthNum; i2++) {
        if (i == 0 && i2 == 0 || i == 0 && i2 == widthNum - 1
                || i == heightNum - 1 && i2 == 0 || i == heightNum - 1 && i2 == widthNum - 1) {
          System.out.print(angle[0]);
          continue;
        }
        if (i == 0 && (i2 > 0 && i2 < widthNum - 1) || (i > 0 && i < heightNum - 1 && i2 == 0)
                || (i > 0 && i < heightNum - 1 && i2 == widthNum - 1)
                || (i2 > 0 && i2 < widthNum - 1 && i == heightNum - 1)) {
          System.out.print(side[0]);
          continue;

        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  /**
   * askdyashdayhsdasodu.
   */
  private static char[] stringToCharHeight(String[] inputArray) {
    int SymbolPosition = 0;
    char[] height = new char[inputArray[SymbolPosition].length()];
    for (int i = 0; i < height.length; i++) {
      height[i] = inputArray[SymbolPosition].charAt(i);
    }
    return height;
  }

  /**
   * askdyashdayhsdasodu.
   */
  private static char[] stringToCharWidth(String[] inputArray) {
    int SymbolPosition = 1;
    char[] width = new char[inputArray[SymbolPosition].length()];
    for (int i = 0; i < width.length; i++) {
      width[i] = inputArray[SymbolPosition].charAt(i);
    }
    return width;
  }

  /**
   * askdyashdayhsdasodu.
   */
  private static char[] stringToCharAngle(String[] inputArray) {
    int SymbolPosition = 3;
    char[] angle = new char[inputArray[SymbolPosition].length()];
    for (int i = 0; i < angle.length; i++) {
      angle[i] = inputArray[SymbolPosition].charAt(i);
    }
    return angle;
  }

  /**
   * askdyashdayhsdasodu.
   */
  private static char[] stringToCharSide(String[] inputArray) {
    int SymbolPosition = 2;
    char[] side = new char[inputArray[SymbolPosition].length()];
    for (int i = 0; i < side.length; i++) {
      side[i] = inputArray[SymbolPosition].charAt(i);
    }
    return side;
  }
}
