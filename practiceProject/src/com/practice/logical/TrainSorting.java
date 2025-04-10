package com.practice.logical;

import java.util.*;

public class TrainSorting {
	public static void main(String[] args) {

		int[][] trainTimings = new int[][] { { 630, 820 },{ 600, 700 },  { 1200, 1500 } };
		// Expected answer: 2
		int numPlatformsRequired = getNumPlatformsRequired(trainTimings);
		System.out.println("Number of platforms required at the train station is/are : " + numPlatformsRequired);
	}

	static int getNumPlatformsRequired(int[][] trainTimings) {
		int n = trainTimings.length;
		System.out.println("length "+n);
		int[] arrival = new int[n];
		int[] departure = new int[n];
		// Extract arrival and departure times
		for (int i = 0; i < n; i++) {
			arrival[i] = trainTimings[i][0];
			departure[i] = trainTimings[i][1];
		}
		Arrays.sort(arrival);
		Arrays.sort(departure);		
		int i = 1, j = 0;
		int platformsNeeded = 1;
		int maxPlatforms = 1;
		while (i < n && j < n) {
			if (arrival[i] <= departure[j]) {
				platformsNeeded++; // Train arrives before previous departs
				i++;
			} else {
				platformsNeeded--; // Train departs
				j++;
			}
			maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
		}
		return maxPlatforms;
	}
}
