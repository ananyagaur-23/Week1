import java.util.Scanner;
public class Y3{
	public static boolean LeapYear(int y){
		if(y>=1582){
			if(y%4==0){
				if(y%100==0){
					if(y%400==0){
						return true;
					}
					return false;
				}
				return true;
			}
			return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year: ");
		int y = sc.nextInt();
		
		boolean LY = LeapYear(y);
		
		if(LY == true){
			System.out.println(y+" is a Leap Year.");
		}
		else{
			System.out.println(y+" is not a Leap Year.");
		}
	}
}
		