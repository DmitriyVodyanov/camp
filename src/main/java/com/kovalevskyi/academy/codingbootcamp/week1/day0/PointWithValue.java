package com.kovalevskyi.academy.codingbootcamp.week1.day0;

import com.kovalevskyi.academy.codingbootcamp.week0.day3.Point;
import java.util.function.Function;

/**
* generateTuples.
*/
public class PointWithValue<T> extends Point {

  final T value;

  public PointWithValue(int coordinateX, int coordinateY, T value) {
    super(coordinateX, coordinateY);
    this.value = value;
  }

  /**
   * generateTuples.
   */
  public T getValue() {
    return value;
  }

  /**
   * mapPoint.
   */
  public <R> PointWithValue<R> mapPoint(Function<T, R> mapFunction) {
    return new PointWithValue(getX(), getY(), mapFunction.apply(value));
  }

  /**
   * generateTuples.
   */
  @Override
  public String toString() {
    return String.format("PointWithValue{ X: %d, Y: %d, value: %s}", 
      this.getX(), this.getY(), value);
  }
}
