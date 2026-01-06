package com.test;

public class Mediancal {
	
	public static void main(String[] args) {
		
		int [] a= {12,3,4};
		int[] b ={2,5,6,9};
		
		//2,3,4,5,6,9,12
		
		System.out.println("Median: " + findMedianSortedArrays(a, b));  // Output: 2.5
	}
	
	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[] merged = new int[nums1.length + nums2.length];
	        int i = 0, j = 0, k = 0;

			/*
			 * while (i < nums1.length && j < nums2.length) { merged[k++] = (nums1[i] <
			 * nums2[j]) ? nums1[i++] : nums2[j++]; }
			 */

			/*
			 * while (i < nums1.length) { merged[k++] = nums1[i++]; }
			 * 
			 * while (j < nums2.length) { merged[k++] = nums2[j++]; }
			 */
	        
	        for( i=0; i<nums1.length ;i++)
	        {
	        	merged[k]=nums1[i];
	        	k++;
	        }
	        for( j=0; j<nums2.length ;j++)
	        {
	        	merged[k]=nums2[j];
	        	k++;
	        }

	        int temp=0;
	       for(int l=0;l<merged.length;l++)
	       {
	    	  for(int O=l+1 ;O<merged.length ; O++)
	    	  {
	    		  if(merged[l]>merged[O])
	    		  {
	    			  temp=merged[l];
	    			  merged[l] =merged[O];
	    			  merged[O]=temp;
	    			  
	    		  }
	    	  }
	    	  System.out.println(merged[l]);
	       }
	        int mid = merged.length / 2;
	        if (merged.length % 2 == 0) {
	            return (merged[mid - 1] + merged[mid]) / 2.0;
	        } else {
	            return merged[mid];
	        }
	    }

	   
	}


