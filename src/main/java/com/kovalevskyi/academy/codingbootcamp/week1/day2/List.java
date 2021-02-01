package com.kovalevskyi.academy.codingbootcamp.week1.day2;

/**
 * List.
 */
public class List<T> {

  private final List<T> next;
  private final List<T> previous;
  private final T item;
  private final int size = 0;

  private List(List<T> prev, List<T> next, T value) {
    this.previous = prev;
    this.next = next;
    this.item = value;
  }
}
