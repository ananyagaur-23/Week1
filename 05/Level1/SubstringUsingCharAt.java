import java.util.Scanner;
public class SubstringUsingCharAt{
	public static String Substring(String s,int start,int end){
		StringBuilder result = new StringBuilder();
		for(int i = start;i<end;i++){
			result.append(s.charAt(i));
		}
		return result.toString();
	}
	public static boolean compare(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i = 0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = sc.next();
		System.out.print("Enter start index: ");
		int start = sc.nextInt();
		System.out.print("Enter end index: ");
		int end = sc.nextInt();
		
		String substringCharAt = Substring(s,start,end);
		String substringBuiltIn = s.substring(start,end);
		
		boolean comparisonResult = compare(substringCharAt,substringBuiltIn);
		
		System.out.println("\nSubstring using charAT(): "+substringCharAt);
		System.out.println("\nSubstring using substring(): "+substringBuiltIn);
		System.out.println("\nComparison of result: "+comparisonResult);
	}
}
		
		