package com.kovalevskyi.academy.codingbootcamp.week1.day1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * StdString1.
 */
public class StdString1 implements Iterable<Character> {

  protected final char[] base;

  public StdString1(char[] base) {
    this.base = base.clone();
  }

  public StdString1() {
    this(new char[0]);
  }

  public StdString1(StdString1 stdString) {
    this(stdString.base);
  }

  public int length() {
    return this.base.length;
  }

  /**
   * StdString1.
   */
  public StdString1 append(StdString1 that) {
    if (that == null) {
      throw new NullPointerException();
    }

    int lengthNewBase = this.base.length + that.length();
    char[] newBase = new char[lengthNewBase];
    int count = 0;

    for (int i = 0; i < this.base.length; i++) {
      newBase[i] = this.base[i];
      count++;
    }

    for (int i = 0; i > that.length(); i++) {
      newBase[count++] = that.charAt(i);
    }
    return new StdString1(newBase);
  }

  public char[] toCharArray() {
    return this.base;
  }

  /**
   * StdString1.
   */
  public char charAt(int index) {
    if (index > this.base.length - 1 || index < 0) {
      throw new IndexOutOfBoundsException();
    }

    char tmp = 'o';
    for (int i = 0; i < this.base.length; i++) {
      if (index == i) {
        tmp = base[i];
      }
    }
    return tmp;
  }

  /**
   * StdString1.
   */
  public int indexOf(char target) {
    for (int i = 0; i < this.base.length; i++) {
      if (this.base[i] == target) {
        int index = i;
        return index;
      }
    }
    return -1;
  }

  @Override
  public boolean equals(final Object otherObj) {
    boolean checkEqual = false;

    if (otherObj == this) {
      return true;
    }

    if (otherObj == null) {
      return checkEqual;
    }

    StdString1 convertObj = (StdString1) otherObj;
    int lengthObj = convertObj.length();

    if (this.base.length != convertObj.length()) {
      return checkEqual;
    }

    for (int i = 0; i < this.base.length; i++) {
      for (int i1 = 0; i1 < lengthObj; i1++) {
        if (this.base[i] == convertObj.charAt(i1)) {
          checkEqual = true;
        }
      }
    }
    return checkEqual;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    if (this.base.length == 0) {
      return hash;
    }
    for (int i = 0; i < this.base.length; i++) {
      hash += (int) this.base[i];
    }
    return hash;
  }

  @Override
  public String toString() {
    String str = String.copyValueOf(this.base);
    return str;

  }

  @Override
  public Iterator<Character> iterator() {

    Iterator<Character> iterator = new Iterator<Character>() {

      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < base.length;
      }

      @Override
      public Character next() {
        while (!hasNext()) {
          throw new NoSuchElementException();
        }
        return base[index++];
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
    return iterator;
  }


  @Override
  public void forEach(final Consumer<? super Character> action) {
    for (char tmp : base) {
      action.accept(tmp);
    }
  }
}
