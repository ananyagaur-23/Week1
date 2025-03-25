import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            do{
                System.out.print("Marks in Physics: ");
                physics[i] = sc.nextInt();
            } while (physics[i] < 0 || physics[i] > 100);
            
            do{
                System.out.print("Marks in Chemistry: ");
                chemistry[i] = sc.nextInt();
            } while (chemistry[i] < 0 || chemistry[i] > 100);
            
            do{
                System.out.print("Marks in Maths: ");
                maths[i] = sc.nextInt();
            } while (maths[i] < 0 || maths[i] > 100);
            
            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            
            if(percent[i] >= 80){
                grade[i] = "A";
            }
            else if(percent[i] >= 70){
                grade[i] = "B";
            }
            else if(percent[i] >= 60){
                grade[i] = "C";
            }
            else if(percent[i] >= 50){
                grade[i] = "D";
            }
            else if(percent[i] >= 40){
                grade[i] = "E";
            }
            else{
                grade[i] = "R";
            }
        }    
        
        System.out.println("No. Physics Chemistry Maths Percentage Grade");
        for(int i = 0; i < n; i++){
            System.out.printf("%d  %d  %d  %d  %.2f  %s%n", (i+1), physics[i], chemistry[i], maths[i], percent[i], grade[i]);
        }
    }
}
