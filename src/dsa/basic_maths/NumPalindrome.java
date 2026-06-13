package dsa.basic_maths;
import java.util.Scanner;
public class NumPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num=sc.nextInt();
		palNum(num);
	}
	
	public static void palNum(int n) {
		int org=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		if(org==rev) {
			System.out.println("Given number is palindrome!");
		}else {
			System.out.println("Given number is not  palindrome!");
		}
	}
}
