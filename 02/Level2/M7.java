import java.util.Scanner;
public class M7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n>0) {
            System.out.println("Factors of " + n + " are:");

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
