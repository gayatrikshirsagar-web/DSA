package dsa.basic_maths;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number a:");
		int a=sc.nextInt();
		
		System.out.println("Enter number a:");
		int b=sc.nextInt();
		System.out.println(returnGCD( a, b));
	}
	
	
	public static int returnGCD(int a,int b) {
		while(a>0&& b>0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
				
		}
		if(a==0)
			return b;
		return a;
	}
}
