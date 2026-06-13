package dsa.recursion;

public class StringPalindrome {
	public static void main(String[] args) {
		String s="MADAMS";
		System.out.println(stringPal(s,0));
		
	}
	
	public static boolean stringPal(String str, int i) {
		if(i>=str.length()/2) {
			return true;
		}
		
		if(str.charAt(i)!=str.charAt(str.length()-i-1)){
			return false;
		}
		return stringPal(str,i+1);
	}
}
