package dsa.array;

public class RotateArrayByKBrute {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int k=3;
		int temp[]=new int[arr.length];
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=k;i<arr.length;i++) {
			arr[i-k]=arr[i];
			
		}
		
		for(int i=arr.length-k;i<arr.length;i++) {
			arr[i]=temp[i-(arr.length-k)];
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]); 
		}
	}
	
	

}
