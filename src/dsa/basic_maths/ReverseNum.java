package dsa.basic_maths;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println("Reverse number:"+ revNum(num));
	}
	
	public static int revNum(int n) {
		int rev=0;
		while(n>0) {
			int rem =n%10;
			n=n/10;
			
			 rev=rev*10+rem;
		}
		return rev;
	}
}
