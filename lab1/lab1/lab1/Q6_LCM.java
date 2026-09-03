import java.util.Scanner;

public class Q6_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // LCM = (a * b) / GCD
        int x = a, y = b;
        while (y!=0) {
            int rem = x%y;
            x = y;
            y = rem;
        }
        int gcd = x;
        int lcm = (a*b)/gcd;

        System.out.println("LCM of "+a+" and "+b+" = "+lcm);
        sc.close();
    }
}
