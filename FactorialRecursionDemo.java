import java.util.*;

class FactorialRecursion {

    int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {

            return (factorial(n - 1) * n);
        }
    }
}

class FactorialRecursionDemo {
    public static void main(String args[]) {
        FactorialRecursion f = new FactorialRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.err.println("Factorial value==" + f.factorial(n));
    }
}