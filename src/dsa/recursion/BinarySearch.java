package dsa.recursion;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {12,15,15,30,32,45,60};
		int s=0;
		int e=arr.length-1;
		int key=32;
		System.out.println(search(arr,s,e,key));		
	}
	
	static int search(int arr[],int s,int e, int key) {
		
		if(s>e) {
			return -1;
		}
		int m=s+(e-s)/2;
		if(arr[m]==key) {
			return m;
		}
		if(key<arr[m]) {
			return search(arr,s,m-1,key);
		}
			return search(arr,m+1,e,key);
		
		
	}

}
