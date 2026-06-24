package dsa.array;

import java.util.HashSet;
import java.util.Set;
//Brute approach TC=>O(n)
//SC=>O(n)
public class RemoveDuplicates {
public static void main(String[] args) {
	int arr[]= {1,1,2,2,3,3};
	Set<Integer>nums=new HashSet<>();
	for(Integer n:arr) {
		nums.add(n);
	}
	System.out.println(nums);
}
}
