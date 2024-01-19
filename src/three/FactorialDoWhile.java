package three;

public class FactorialDoWhile {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

    public static int factorial(int number) {
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        return factorial;
    }
}
