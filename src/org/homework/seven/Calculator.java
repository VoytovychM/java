package org.homework.seven;

import java.text.DecimalFormat;

public class Calculator {
    public String getResult (String string){
        int operationsCount = getCountOperations (string);
        double[] arguments = getArguments (string, operationsCount);
        char[] operations = getOperations (string, operationsCount);
        double result = arguments[0];
        for (int i = 1; i < arguments.length; i++) {
            result = calculate(result, operations[i-1], arguments[i]);

        }
         return getResultToString (arguments, operations, result);

    }

    private String getResultToString(double[] arguments, char[] operations, double result) {
        StringBuilder stringBuilder = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i = 0; i < arguments.length; i++) {
            if (i == arguments.length -1){
                stringBuilder.append(decimalFormat.format(arguments[i]))
                        .append(" ");

            } else {
                stringBuilder.append(decimalFormat.format(arguments[i]))
                        .append(" ")
                        .append(operations[i])
                        .append(" ");
            }
        }
        stringBuilder.append("= ").append(decimalFormat.format(result));
        return  stringBuilder.toString();
    }

    private double calculate(double argument1, char operations, double argument2) {
        switch (operations){

            case '+':
            return argument1 + argument2;
            case '-':
            return argument1 - argument2;
            case '*':
            return argument1 * argument2;
            case '/':
            if(argument2 == 0){
                System.out.println("Cannot divide by 0");
                System.exit(0);
            } else{
                return argument1 / argument2;
            }
            default:
                return 0;

        }
    }

    private char[] getOperations(String string, int operationsCount) {
        char[] operations = new char[operationsCount];
        int indexOperation = 0;
        for (int i = 0; i < string.length(); i++) {
          if(isOperation(string.charAt(i))) {
              char operation = string.charAt(i);
              operations[indexOperation] = operation;
              indexOperation ++;
          }
        }
        return  operations;
    }

    private double[] getArguments(String string, int operationsCount) {
        double[] arguments = new double[operationsCount +1];
        int indexDouble = 0;
        int startPoint = 0;
        for (int i = 0; i < string.length(); i++) {
            if(isOperation(string.charAt(i))){
                String stringArgument = string.substring(startPoint, i);
                startPoint = i + 1;
            double argument = Double.parseDouble(stringArgument);
            arguments[indexDouble] = argument;
            indexDouble++;

            }
            if (i == string.length() -1){
                String stringArgument = string.substring(startPoint);
                double argument = Double.parseDouble(stringArgument);
                arguments[indexDouble] = argument;
            }
        }
        return arguments;
    }

    private int getCountOperations(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(isOperation(string.charAt(i))) {
                count++;
            }


        }
        return count;
    }

    private boolean isOperation(char c) {
        return c == '+' || c == '-' || c == '*' || c =='/';
    }
}
