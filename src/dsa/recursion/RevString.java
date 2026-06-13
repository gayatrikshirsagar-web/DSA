package dsa.recursion;

public class RevString {
	static String strRev(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return strRev(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(strRev("Gayatri"));
	}

}
