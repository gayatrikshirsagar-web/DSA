package dsa.recursion;
import java.util.Scanner;
public class ReverseArray {
	Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		revArray(arr,arr.length,0);
		
	}
	
	static void revArray(int arr[],int n,int m) {
		int temp=0;
		int start=0;
		int end=n-1;
		if(start>=end) {
			return;
		}
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		revArray(arr,start-1,end-1);

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
		System.out.println();
	}
	
	
}
