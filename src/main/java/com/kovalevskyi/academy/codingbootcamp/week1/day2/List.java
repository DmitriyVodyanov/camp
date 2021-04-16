package com.kovalevskyi.academy.codingbootcamp.week1.day2;

import java.util.function.Function;

public class List<T> {

    private T item;
    private List<T> next;
    private List<T> previous;
    private static List first;
    private static List last;

    private List(List<T> prev, List<T> next, T value) {
        this.previous = prev;
        this.next = next;
        this.item = value;
    }

   public static <T> List<T> createOne(T value) {
        List<T> newList = new List<>(null, null, value);
        first = newList;
        last = newList;
        return newList;
    }

    public static <T> List<T> addToEnd(List<T> list, T newValue) {
        List<T> lastList = last;
        List<T> newList = new List<>(lastList, null, newValue);
        last = newList;
        if (lastList == null) {
            first = newList;
        } else {
            lastList.next = newList;
        }
        return newList;
    }

    
    public static <T> List<T> addToStart(List<T> list, T newValue) {
        List<T> firstList = first;
        List<T> newList = new List<>(firstList, null, newValue);
        last = newList;
        if (firstList == null) {
            last = newList;
        } else {
            firstList.previous = newList;
        }
        return newList;
    }

    
    public static <T> boolean contains(List<T> list, T value) {
        List<T> currentList = first;
        while (currentList != last.next) {
            if (currentList.item.equals(value)) {
                return true;
            } else {
                currentList = currentList.next;
            }
        }
        return false;
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapFunction) {
        List<T> currentList = first;
        List<R> newList = createOne(mapFunction.apply(currentList.item));
        currentList = currentList.next;

        while (currentList != null) {
            addToEnd(newList, mapFunction.apply(currentList.item));
            currentList =currentList.next;
        }
        return newList;
    }

    public int length() {
        int size = 0;
        List<T> currentList = first;
        while (currentList != first) {
            size++;
        }
        return size;
    }

}
