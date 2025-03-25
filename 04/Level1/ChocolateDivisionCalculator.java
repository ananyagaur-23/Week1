import java.util.Scanner;
public class ChocolateDivisionCalculator{
    public static int[] RandQ(int n1, int n2) {
        int[] result = new int[2];
        result[0] = n1 / n2;
        result[1] = n1 % n2; 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int Chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int Children = sc.nextInt();

        if (Children == 0) {
            System.out.println("Cannot divide chocolates by zero!");
        } else {
            int[] result = RandQ(Chocolates, Children);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
