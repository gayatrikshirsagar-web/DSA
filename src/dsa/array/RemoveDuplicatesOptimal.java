package dsa.array;

public class RemoveDuplicatesOptimal {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,3};
		System.out.println(removeDuplicate(arr));
		
	}
	
	public static int removeDuplicate(int arr[]) {
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		return i+1;
	}

}
