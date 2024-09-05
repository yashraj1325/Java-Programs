public class Bino {
public static void main(String[] args) {
        int n = 5; // example values
        int r = 2; // example values
        System.out.println("Binomial coefficient (" + n + " choose " + r + ") is: " + binomial(n, r));
    }

    private static int binomial(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

 
