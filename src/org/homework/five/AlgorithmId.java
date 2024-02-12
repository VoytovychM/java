package org.homework.five;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert type of Algorithm 1 for Fibonacci sequence or 2 for Factorial: ");
        int taskNumber = scanner.nextInt();
        System.out.println("Insert loop  type 1 - use while cicle; 2 - use cycle do-while; 3 - use cycle for:");
        int cycleNumber = scanner.nextInt();
        System.out.println("Insert number: ");
        int number = scanner.nextInt();
        AlgorithmManager result = new AlgorithmManager();
        System.out.println(Arrays.toString(result.getResultArray(taskNumber, cycleNumber, number)));


    }


}


