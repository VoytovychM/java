package three;

public class FactorialFor {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Factorial of " + number + " is: " + factorial(number));

    }
    public static int factorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i ++) {
            factorial = factorial *= i;
        }
        return factorial;
    }
}
