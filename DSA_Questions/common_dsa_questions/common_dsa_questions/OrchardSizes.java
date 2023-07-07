package common_dsa_questions;

import java.util.*;

public class OrchardSizes {
	public static void main(String[] args) {
		// Input matrix
		char[][] matrix = { { 'O', 'T', 'O', 'O' }, { 'O', 'T', 'O', 'T' }, { 'T', 'T', 'O', 'T' },
				{ 'O', 'T', 'O', 'T' } };

		// Computing the orchard sizes
		List<Integer> orchardSizes = computeOrchardSizes(matrix);

		// Printing the orchard sizes
		for (int size : orchardSizes) {
			System.out.print(size + " ");
		}
	}

	public static List<Integer> computeOrchardSizes(char[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean[][] visited = new boolean[rows][cols]; // Track down the visited cells
		List<Integer> orchardSizes = new ArrayList<>(); // Store orchard sizes

		// Iterate over each cell in the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 'T' && !visited[i][j]) { // If cell contains a tree and hasn't been visited
					int size = countOrchardSize(matrix, visited, i, j); // Calculate orchard size
					orchardSizes.add(size); // Add orchard size to the list
				}
			}
		}

		return orchardSizes;
	}

	private static int countOrchardSize(char[][] matrix, boolean[][] visited, int row, int col) {
		int size = 0; // Current orchard size
		int rows = matrix.length;
		int cols = matrix[0].length;

		// Base cases for terminating the recursion
		if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || matrix[row][col] == 'O') {
			return size; // If cell is out of bounds, visited, contains 'O', or already counted, return
							// current size
		}

		visited[row][col] = true; // Mark current cell as visited
		size++; // Increment the orchard size

		// Checking the neighboring cells horizontally, vertically, and diagonally
		int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
		int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

		for (int i = 0; i < 8; i++) {
			int newRow = row + dr[i];
			int newCol = col + dc[i];

			size += countOrchardSize(matrix, visited, newRow, newCol); // Recursively count orchard size
		}

		return size; // Return the final orchard size
	}
}

// Overall this program effectively computes the sizes of all orchards in the matrix by performing a DFS starting from each tree cell. The recursion 
// allows the program to explore all connected tree cells and increment the orchard size accordingly.
