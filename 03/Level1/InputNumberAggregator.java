import java.util.Scanner;
public class InputNumberAggregator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] num = new double[10]; 
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter 0 or a negative number to stop. \nEnter numbers:- ");

        while (true) {
            System.out.print("Enter number: ");
            double value = sc.nextDouble(); 
            
            if (value <= 0) { 
                break;
            }

            if (index < 10) {
                num[index] = value; 
                index++;
            } else {
                break;
            }
        }

        System.out.print("\nNumbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(num[i] + ", ");
            total += num[i];
        }

        System.out.println("\nTotal sum: " + total);
        sc.close();
    }
}
