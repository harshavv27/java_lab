import java.util.Scanner;

public class Q8_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;
        while (n!=0) {
            int digit = n%10;
            reversed = reversed*10+digit;
            n = n/10;
        }

        System.out.println("Reverse of "+original+" = "+reversed);
        sc.close();
    }
}
