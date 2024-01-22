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

        for (int i = 0; i <= height; i++) {
            if (i == 0) {
                System.out.println(1);
            }
            System.out.print(1);
            for (int x = 0; x < i; x++) {
                System.out.print(0);
            }
            System.out.println(1);
        }


        for (int i = height; i >= 0; i--) {
            System.out.print(1);
            for (int x = 0; x < i; x++) {
                System.out.print(0);
            }
            if (i != 0) {
                System.out.println(1);
            }


        }
    }
}

