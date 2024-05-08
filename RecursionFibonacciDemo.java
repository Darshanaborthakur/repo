import java.util.Scanner;

class RecursionFibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void displayfibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
            displayfibonacci(count - 1);

        }
    }
}

class RecursionFibonacciDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int count = sc.nextInt();
        System.out.println(RecursionFibonacci.n1 + " " + RecursionFibonacci.n2);
        RecursionFibonacci.displayfibonacci(count - 2);
    }
}