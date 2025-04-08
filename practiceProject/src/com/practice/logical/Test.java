package com.practice.logical;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[][] trainTimings = new int[][] { { 630, 820 },{ 600, 700 },  { 1200, 1500 } };
		// Expected answer: 2

		int numPlatformsRequired = getNumPlatformsRequired(trainTimings);
		System.out.println("Number of platforms required at the train station is/are : " + numPlatformsRequired);
	}

	static int getNumPlatformsRequired(int[][] trainTimings) {
		
		int len =trainTimings.length;
		
		int[] arrival =  new int[len];
		int[] depart = new int [len];
		
		for(int i =0;i<len ;i++) {
			arrival[i]= trainTimings[i][0];
			depart[i] = trainTimings[i][1];
		}
		
		Arrays.sort(arrival);
		Arrays.sort(depart);
		
		int i=1;int j=0;
		int platformsNeeded = 1;
		int maxPlatforms = 1;
		
		while( i<len && j<len) {
			
			if (arrival[i] <= depart[j]) {
				platformsNeeded++;
				i++;
			}else {
				platformsNeeded--;
				j++;
			}
			maxPlatforms =Math.max(platformsNeeded, maxPlatforms);
		}
		
		
		return maxPlatforms;
	}
	
}
