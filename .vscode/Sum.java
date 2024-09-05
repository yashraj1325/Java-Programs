import java.util.Scanner;

class Sum {

    // Constructor to perform sum operation
    static int Sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        // Creating an instance of Sum class which will invoke the constructor
        new Sum();
    }
}

