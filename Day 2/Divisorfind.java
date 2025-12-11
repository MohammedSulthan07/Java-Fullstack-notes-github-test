import java.util.Scanner;

public class Divisorfind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return; 
        }
        System.out.println("\nDivisors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}