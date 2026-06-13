package dsa.basic_maths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintDivisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num=sc.nextInt();
		printDivisorB(num);
		printDivisorO(num);
		
	}
	//brute approach time complexity-->O(n)
	public static void printDivisorB(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	
	//Optimal approach time complexity-->O(sqrt(n))
	public static void printDivisorO(int n) {
		ArrayList<Integer>divisor=new ArrayList<>();
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				divisor.add(i);
				if(i!=n/i) {
					divisor.add(n/i);
				}
			}
			
		}
		Collections.sort(divisor); 
		for(Integer num:divisor) {
			System.out.println(num);
		}
		
	}
}
