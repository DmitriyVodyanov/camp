package com.kovalevskyi.academy.codingbootcamp.week1.day0;

import java.util.Comparator;

/**
 * Sorting.
 */
public class Sorting<T> {

  /**
   * sort.
   */
  public static <T> void sort(T[] target, Comparator<T> comparator) {
    if (target == null || comparator == null) {
      throw new NullPointerException();
    }

    if (target.length == 0) {
      return;
    }

    for (int i = target.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (comparator.compare(target[j], target[j + 1]) > 0) {
          T tmp = target[j];
          target[j] = target[j + 1];
          target[j + 1] = tmp;
        }
      }
    }    
  }

  /**
   * sortReversedOrder.
   */
  public static <T> void sortReversedOrder(T[] target, Comparator<T> comparator) {
    if (target == null || comparator == null) {
      throw new NullPointerException();
    }

    if (target.length == 0) {
      return;
    }
    
    for (int i = target.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (comparator.compare(target[j], target[j + 1]) < 0) {
          T tmp = target[j];
          target[j] = target[j + 1];
          target[j + 1] = tmp;
        }
      }
    }  
  }
}
