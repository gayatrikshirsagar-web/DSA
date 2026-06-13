package dsa.basic_maths;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println(primeB(num));
		System.out.println(primeO(num));
		
	}
	
	//Brute approach TC=O(n)
	public static boolean primeB(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
	}
	
	//Optimal approach TC=> O(sqrt(n))
	
	public static boolean primeO(int n) {
		ArrayList<Integer>divisor=new ArrayList<>();
		for(int i=1;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			divisor.add(i);
			
			if(i!=n/i) {
				divisor.add(n/i);
			}
		}
		}
		if(divisor.size()==2) {
			return true;
		}
		return false;
	}
	
}
