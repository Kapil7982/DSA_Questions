package common_dsa_questions;

public class SearchingChallenge {

	public static void main(String[] args) {

		String[] str = { "12256", "56219", "43215" };

		System.out.print(searchingChallenge(str));

	}

	public static int searchingChallenge(String[] strArr) {
		int maxPath = 0;
		char[][] matrix = new char[strArr.length][strArr[0].length()];

		for (int i = 0; i < strArr.length; i++) {
			matrix[i] = strArr[i].toCharArray();
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int pathLength = dfs(matrix, i, j, new boolean[matrix.length][matrix[0].length]);
				maxPath = Math.max(maxPath, pathLength);
			}
		}

		return maxPath;
	}

	private static int dfs(char[][] matrix, int row, int col, boolean[][] visited) {
		visited[row][col] = true;
		int maxLength = 0;

		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		for (int[] dir : directions) {
			int newRow = row + dir[0];
			int newCol = col + dir[1];

			if (isValid(newRow, newCol, matrix.length, matrix[0].length) && !visited[newRow][newCol]
					&& matrix[newRow][newCol] > matrix[row][col]) {
				int length = 1 + dfs(matrix, newRow, newCol, visited);
				maxLength = Math.max(maxLength, length);
			}
		}

		visited[row][col] = false;
		return maxLength;
	}

	private static boolean isValid(int row, int col, int numRows, int numCols) {
		return row >= 0 && row < numRows && col >= 0 && col < numCols;
	}

}
