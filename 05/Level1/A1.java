import java.util.Scanner;
public class A1{
	public static boolean compare(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		for(int i = 0; i<s1.length();i++){
			if(s1.charAt(i) != s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st string: ");
		String s1 = sc.next();
		System.out.print("Enter 2nd string: ");
		String s2 = sc.next();
		
		boolean CharAt = compare(s1,s2);
		boolean result = s1.equals(s2);
		
		System.out.print("\nComparison with charAt() method: "+ CharAt);
		System.out.print("\nComparison with equals() method: "+ result);
		System.out.print("\nResults match: "+ (CharAt==result));
	}
}	
	
		