import java.util.Scanner;

class Lc_3754 {

    public long sumAndMultiply(int n) {
        int sum = 0;
        int x = 0;
        int multiplier = 1;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            if (digit != 0) {
                x = x + digit * multiplier;
                multiplier = multiplier * 10;
            }
            n = n / 10;
        }
        return (long) x * sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Lc_3754 obj = new Lc_3754();
        long answer = obj.sumAndMultiply(n);
        System.out.println("Answer = " + answer);
        sc.close();
    }
}