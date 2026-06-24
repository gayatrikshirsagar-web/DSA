package dsa.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedOptimal {
	
	public static void main(String[] args) {
		int arr1[]= {1,1,2,3,4,5};
		int arr2[]= {2,3,4,4,5,6};
		 int j=0;
		 int i=0;
		List<Integer>union=new ArrayList<Integer>();
		while(j<arr2.length && i<arr1.length) {
			if((arr1[i]>=arr2[j]) ) {
				if(union.size()==0 || !union.contains(arr2[j])) {
				union.add(arr2[j]);
				
				}
				j++;
			}
			
			if((arr1[i]<=arr2[j]) ) {
				if(union.size()==0 || !union.contains(arr1[i])) {
				union.add(arr1[i]);
				
				}
				i++;
			}
			
		}
		
		while(j<arr2.length) {
				if(union.size()==0 || !union.contains(arr2[j])) {
				union.add(arr2[j]);
				
				
			}
				j++;
		}
		
		while(i<arr1.length) {
				if(union.size()==0 || !union.contains(arr1[i])) {
				union.add(arr1[i]);
			
			}
				i++;
		}
		System.out.println();
		System.out.println("Union:"+union);
	}

}
