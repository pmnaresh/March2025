package com.test;

public class BinarySearchEx {

	public static void main(String[] args) {
		
		int[] data = {10, 20, 30, 40, 50};
        int key = 40;
        
        int i=findExactNumber(data,key);
        System.out.println(i);
	}
//https://www.geeksforgeeks.org/java-8-interview-questions-and-answers/
	//https://www.ccbp.in/blog/articles/java-8-coding-interview-questions-and-answers
	//https://www.ccbp.in/blog/articles/java-8-coding-interview-questions-and-answers
	//https://www.interviewbit.com/java-8-interview-questions/
	public static int findExactNumber(int arr[],int target)
	{
		
		int low=0; int high = arr.length-1;
		
		while(low<=high )
		{
			int mid =  (low+high)/2;
			
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] <= target)
				low=mid+1;
			else
				low=mid-1;
		}
		return -1;
		
	}
}
