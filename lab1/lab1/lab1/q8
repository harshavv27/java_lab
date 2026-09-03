import java.util.Scanner;

public class Q7_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();

        long num = Math.abs(n);
        int count = 0;

        if (num==0) {
            count = 1;
        } else {
            while (num>0) {
                count++;
                num = num/10;
            }
        }

        System.out.println("Number of digits in "+n+" = "+count);
        sc.close();
    }
}
