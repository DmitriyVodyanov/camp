package com.kovalevskyi.academy.codingbootcamp.week1.day3;

import com.kovalevskyi.academy.codingbootcamp.week1.day1.StdString1;
import com.kovalevskyi.academy.codingbootcamp.week1.day1.StringUtils;

/**
 * isAsciiUppercase.
 */
public class StdString2 extends StdString1 {

  public StdString2(char[] base) {
    super(base);
  }

  public StdString2() {
    this(new char[0]);
  }

  public StdString2(StdString2 stdString) {
    this(stdString.base);
  }

  /**
   * toAsciiLowerCase.
   */
  public StdString2 toAsciiLowerCase() {
    char[] lowerCaseArray = new char[this.base.length];
    int count = 0;
    for (char symbol : this.base) {
      lowerCaseArray[count] = StringUtils.toAsciiLowercase(symbol);
      count++;
    }
    return new StdString2(lowerCaseArray);
  }

  /**
   * toAsciiUpperCase.
   */
  public StdString2 toAsciiUpperCase() {
    char[] upperCaseArray = new char[this.base.length];

    int count = 0;
    for (char symbol : this.base) {
      upperCaseArray[count] = StringUtils.toAsciiUppercase(symbol);
      count++;
    }
    return new StdString2(upperCaseArray);
  }

  /**
   * subString.
   */
  public StdString2 subString(int from, int to) {
    if (from < 0 || to > this.base.length) {
      throw new IndexOutOfBoundsException();
    }
    if (from > to || from == to) {
      throw new IllegalArgumentException();
    }
    char[] subStringArray = new char[to - from];
    int count = 0;
    for (int i = 0; i < base.length; i++) {
      if (from == i) {
        subStringArray[count] = this.base[i];
        count++;
        from += 1;
        if (from == to) {
          break;
        }
      }
    }
    return new StdString2(subStringArray);
  }

  /**
   * concat.
   */
  public StdString2 concat(StdString2[] that) {
    if (this.base == null) {
      throw new NullPointerException();
    }
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < this.base.length; i++) {
      stringBuilder.append(this.base[i]);
    }
    for (int i = 0; i < that.length; i++) {
      if (that[i] == null) {
        throw new NullPointerException();
      }
      stringBuilder.append(that[i]);
    }
    char[] concatArray = new char[stringBuilder.length()];
    for (int i = 0; i < stringBuilder.length(); i++) {
      concatArray[i] = stringBuilder.charAt(i);
    }
    return new StdString2(concatArray);
  }

  /**
   * split.
   */
  public StdString2[] split(char separator) {
    int from = 0;
    int to = 0;
    int lengthArray = 0;
    for (int i = 0; i < this.base.length; i++) {
      if (this.base[i] == separator) {
        lengthArray++;
      }
      if ((this.base[i] == separator && i == 0)
              || (this.base[i] == separator
              && this.base[i] == separator && i == this.base.length - 1)) {
        lengthArray--;
      }
    }
    StdString2[] stdString2 = new StdString2[lengthArray + 1];
    return stdString2;
  }

  /**
   * trim.
   */
  public StdString2 trim() {
    if (this.base == null) {
      throw new NullPointerException();
    }
    char space = ' ';
    int from = 0;
    int to = 0;
    if (this.base.length == 0) {
      return new StdString2();
    }
    for (int i = 0; i < this.base.length; i++) {
      if (this.base[i] != space) {
        from = i;
        break;
      }
    }
    for (int i = this.base.length - 1; i >= 0; i--) {
      if (this.base[i] != space) {
        to = i;
        break;
      }
    }
    return subString(from, to + 1);
  }

  /**
   * removeCharacter.
   */
  public StdString2 removeCharacter(char toRemove) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < this.base.length; i++) {
      if (this.base[i] != toRemove) {
        stringBuilder.append(this.base[i]);
      }
    }
    char[] newBase = new char[stringBuilder.length()];
    for (int i = 0; i < stringBuilder.length(); i++) {
      newBase[i] = stringBuilder.charAt(i);
    }
    return new StdString2(newBase);
  }
}
