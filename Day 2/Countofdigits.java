import java.util.Scanner; 
public class Countofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();
        int originalNumber = n; 
        if (n == 0) {
            System.out.println("The number " + originalNumber + " has 1 digit.");
            return; 
        }
        if (n < 0) {
            n = -n;
        }
        int count = 0;
        while (n != 0) {
            n /= 10; 
            count++; 
        }
        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}