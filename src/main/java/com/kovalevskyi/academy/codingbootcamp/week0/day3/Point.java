package com.kovalevskyi.academy.codingbootcamp.week0.day3;

import com.kovalevskyi.academy.codingbootcamp.week0.day2.Numbers2;

/**
 * Point.
 */
public class Point<T> extends Numbers2 implements Comparable<Point> {

  private final int coordinateX;
  private final int coordinateY;

  public Point(final int coordinateX, final int coordinateY) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
  }

  /**
   * sum.
   */
  public Point sum(final Point that) {
    int sumNewCoordinateX = coordinateX + that.getX();
    int sumNewCoordinateY = coordinateY + that.getY();
    Point newSumPoint = new Point(sumNewCoordinateX, sumNewCoordinateY);
    return newSumPoint;
  }

  /**
   * updateX.
   */
  public Point updateX(int newX) {
    Point newPoint = new Point(newX, coordinateY);
    return newPoint;
  }

  /**
   * updateY.
   */
  public Point updateY(int newY) {
    Point newPoint = new Point(coordinateY, newY);
    return newPoint;
  }

  /**
   * distanceTo.
   */
  public int distanceTo(Point that) {
    int distanceX = (coordinateX - that.getX()) * (coordinateX - that.getX());
    int distanceY = (coordinateY - that.getY()) * (coordinateY - that.getY());
    return distanceX + distanceY;
  }

  /**
   * toString.
   */
  @Override
  public String toString() {
    return "Point{" + "X: " + coordinateX + "," + " Y: " + coordinateY + "}";
  }

  /**
   * compareTo.
   */
  @Override
  public int compareTo(Point that) {
    return hashCode() - that.hashCode();
  }

  /**
   * equals.
   */
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return (this.coordinateX == point.coordinateX && this.coordinateY == point.coordinateY);
  }

  /**
   * gethashCode.
   */
  @Override
  public int hashCode() {
    return coordinateX + coordinateY;
  }

  /**
   * getX.
   */
  public int getX() {
    return coordinateX;
  }

  /**
   * getY.
   */
  public int getY() {
    return coordinateY;
  }
}
