package org.homework.four;

public class TasksTwo {
    public static void main(String[] args) {

//    }
//     for (int i = 1; i <= 100; i++) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println(i + " = FizzBuzz");
//        }
//        else if (i % 3 == 0) {
//            System.out.println(i + " = Fizz");
//        } else if (i % 5 == 0) {
//            System.out.println(i + " = Buzz");
//        }
//        else{
//            System.out.println(i);
//        }
        int height = 14;
        printUpperPart(height);
        printLowerPart(height);
    }

    public static void printUpperPart(int height) {
        int target = height - 2;
        for (int i = 0; i <= target; i++) {
            if (i == 0) {
                System.out.println(1);
            }
            System.out.print(1);
            for (int x = 0; x < i; x++) {
                System.out.print(0);
            }
            System.out.println(1);
        }
    }

    public static void printLowerPart(int height) {
        int target = height - 2;
        for (int i = target - 1; i >= 0; i--) {
            System.out.print(1);
            for (int x = 0; x < i; x++) {
                System.out.print(0);
            }
            System.out.println(1);
            if (i == 0) {
                System.out.println(1);
            }
        }
    }
}



