package dsa.array;

import java.util.HashSet;
import java.util.Set;

//Brute approach
public class UnionOfTwoSorted {
	public static void main(String[] args) {
		int arr1[]= {1,1,2,3,4,5};
		int arr2[]= {2,3,4,4,5,6};
		
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
			
		Set<Integer>union=new HashSet<Integer>();
		for(Integer num:set) {
			union.add(num);
		}
		System.out.println("Union:"+union);
	}
}
