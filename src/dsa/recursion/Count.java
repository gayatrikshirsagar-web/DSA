package dsa.recursion;

public class Count {
	static void count(int n) {
		//Base case- to stop recursion
		if(n==0) {
			System.out.println("Done!");
			return;
		}
		//Recursion call
		count(n-1);
		System.out.println(n);
	}
	public static void main(String args[]) {
	count(5);
		
	}
	}

