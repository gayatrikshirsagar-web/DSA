package dsa.basic_maths;
import java.util.Scanner ;
public class CountDigits {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		System.out.println("Number od digits in a given number:"+countDig(n));
		
	}
	
	public static int countDig(int num) {
		int n=num;
		 int count=0;
		while(num>0) {
			int rem=n%10;
			 num=num/10;
			 count++;
		}
		return count;
	}
}
