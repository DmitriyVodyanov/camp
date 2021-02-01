package com.kovalevskyi.academy.codingbootcamp.week2.day1;

public class BoxGenerator {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide 4 input arguments, current amount: " + args.length);
            return;
        }

        int height = Integer.valueOf(args[0]);
        int width = Integer.valueOf(args[1]);
        String side = args[2];
        String angle = args[3];

        if (height < 0 || width < 0 || side.length() > 1 || angle.length() > 1) {
            throw new IllegalArgumentException();
        }

        String[][] rectangle = new String[height][width];

//        for (int i = 0; i < rectangle.length; i++) {
//            for (int i2 = 0; i2 < rectangle[i].length; i2++) {
//                rectangle[i][i2] = "0";
//                System.out.print(rectangle[i][i2]);
//                if (i2 == rectangle[i].length - 1) {
//                    for (int i3 = 1; i3 < rectangle.length - 1; i3++) {
//                        rectangle[i3][i2] = "0";
//                        System.out.print(rectangle[i3][i2]);
//                    }
//
//                }
//            }
//            System.out.println("");
//        }
//
//    }
        int h = 5;
        int w = 6;

        String[][] arr = new String[h][w];



        // Внешний цикл
        for(int i = 0; i < arr.length; i++) {
            // Внутренний цикл для печати одной строки
            for(int i2 = 0; i2 < arr[i].length; i2++) {
                // Вот наше сложное условие
                if (i2 == 0 && i == 0 || i == 0 && i2 == arr[i].length - 1
                || i == arr.length - 1 && i2 == 0 || i2 == arr[i].length - 1 && i == arr.length - 1) {
                    System.out.print("#");
                }
                if(i2 == 0 || i2 == arr[i].length - 1 || i == 0 || i == arr[i].length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }

    }

}




