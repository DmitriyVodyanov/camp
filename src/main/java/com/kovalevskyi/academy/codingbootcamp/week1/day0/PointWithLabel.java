package com.kovalevskyi.academy.codingbootcamp.week1.day0;

import com.kovalevskyi.academy.codingbootcamp.week0.day3.Point;

/**
 * generateTuples.
 */
public class PointWithLabel extends PointWithValue<String> {

  public PointWithLabel(int coordinateX, int coordinateY, String value) {
    super(coordinateX, coordinateY, value);
  }

  public String getLabel() {
    return super.getValue();
  }

  @Override
  public int compareTo(Point other) {
    if (other instanceof PointWithLabel) {
      return this.getLabel().compareTo(((PointWithLabel) other).getLabel());
    }
    return super.compareTo(other);
  }
}
