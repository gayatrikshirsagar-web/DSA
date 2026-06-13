package dsa.recursion;

public class SumElements {
	static int add(int n) {
		if(n==0) {
			System.out.println("Done!");
			return 0;
		}
		return n+add(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Addition of n numbers:"+add(5));
	}

}
