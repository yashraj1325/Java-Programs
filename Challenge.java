public class Challenge {
    public static int calculator(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(calculator(10, '+', 5));  // ➞ 15
        System.out.println(calculator(10, '-', 5));  // ➞ 5
        System.out.println(calculator(10, '*', 5));  // ➞ 50
        System.out.println(calculator(10, '/', 5));  // ➞ 2
        // Uncommenting the following line will throw an exception
        // System.out.println(calculator(10, '/', 0)); // ➞ throws ArithmeticException
        // Uncommenting the following line will throw an exception
        // System.out.println(calculator(10, '%', 5)); // ➞ throws IllegalArgumentException
    }
}
