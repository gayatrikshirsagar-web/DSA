package dsa.array;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int arr[]= {0,1,4,0,5,2};
		int temp[]=new int[arr.length];
		int j=0;
		int count=0;
		for(int i=0;i<temp.length;i++) {
			if(arr[i]!=0) {
				temp[j]=arr[i];
				count++;
				j++;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp[i];
		}
		
		for(int i=count;i<arr.length;i++) {
			arr[i]=0;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		int k=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				k=i;
				break;
			}
		}
		for(int i=k+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp1=arr[i];
				arr[i]=arr[k];
				arr[k]=temp1;
				k++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}


}
