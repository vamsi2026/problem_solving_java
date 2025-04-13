package com.practise;

public class RobotPaths {

	// Method to calculate the number of unique paths avoiding obstacles
	private static int uniquePathsWithObstacles(int[][] arr) {
		int r = arr.length;    // Number of rows
		int c = arr[0].length; // Number of columns

		// if the start or end position has an obstacle, return 0 (no paths)
		if (arr[0][0] == 1 || arr[r - 1][c - 1] == 1) {
			return 0;
		}

		// DP table to store the number of unique paths to reach each cell
		int[][] dp = new int[r][c];

		// Starting point has 1 way to be reached (starting itself)
		dp[0][0] = 1;
        
		// Fill the first column (can only come from above)
		for (int i = 1; i < r; i++) {
			// If no obstacle and cell above is reachable 
			dp[i][0] = (arr[i][0] == 0 && dp[i - 1][0] == 1) ? 1 : 0;
		}
         
		// Fill the first row (can only come from left)
		for (int j = 1; j < c; j++) {
			// If no obstacle and cell to the left is reachable
			dp[0][j] = (arr[0][j] == 0 && dp[0][j - 1] == 1) ? 1 : 0;
		}
        
		// Fill the rest of the DP table
		for (int i = 1; i < r; i++) {
			for (int j = 1; j < c; j++) {
				// Only compute if current cell is not an obstacle
				if (arr[i][j] == 0) {
					// Sum of ways from top and left
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
				// If it's an obstacle, dp[i][j] stays 0 (default)
			}
		}
        
		// Return the number of unique paths to bottom-right corner
		return dp[r - 1][c - 1];
	}

	public static void main(String[] args) {

		int[][] arr = { 
				{ 0, 0, 0 },
				{ 0, 1, 0 },
				{ 0, 0, 0 }
				};
		System.out.println("Numbers of unique paths: " + uniquePathsWithObstacles(arr));
	}

}
