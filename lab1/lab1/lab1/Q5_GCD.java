import java.util.Scanner;

public class Q5_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a, y = b;
        while (y!=0) {
            int remainder = x%y;
            x = y;
            y = remainder;
        }

        System.out.println("GCD of "+a+" and "+b+" = "+x);
        sc.close();
    }
}
