package dsa.array;

import java.util.ArrayList;
import java.util.Collections;

public class CheckArrayIsSorted {
public static void main(String[] args) {
	int arr[]= {2,3,3,4,5,16,20};
	ArrayList<Integer> nums=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		nums.add(arr[i]);
	}
	
	System.out.println(isSorted(nums)); 
}

public static  boolean isSorted(ArrayList<Integer> nums) {
    for(int i=1;i<=nums.size()-1;i++){
        if(nums.get(i)>=nums.get(i-1)){

        }else{
            return false;
        }
    }
    return true;
}
}
