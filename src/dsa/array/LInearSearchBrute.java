package dsa.array;

public class LInearSearchBrute {
	public static void main(String[] args) {
		int arr[]= {11,33,45,50,16};
		int key=50;
		System.out.println(LinearSearch(arr,key));
		
	}
	
	public static int LinearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
