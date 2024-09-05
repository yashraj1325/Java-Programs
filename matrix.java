import java.util.Scanner;

public class matrix {
    public static void main(String args[]) {
    int matrix[][] = new int[3][3];
    int n = matrix.length, m = matrix[0].length;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 3x3 matrix elements:");

    // Taking input for matrix elements
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            // Handle non-integer input
            while (!sc.hasNextInt()) {
                System.out.println("Please enter integers only.");
                sc.next(); // Consume the invalid input
            }
            matrix[i][j] = sc.nextInt();
        }
    }

    // Close the Scanner object
    sc.close();

    System.out.println("Matrix entered:");

    // Printing the matrix
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(); // Print a newline after each row
    }
}

}
