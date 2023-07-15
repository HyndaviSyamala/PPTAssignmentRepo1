import java.util.ArrayList;
import java.util.List;

public class Question1 {

	 public int[][] convertTo2DArray(int[] original, int m, int n) {
	        int totalElements = m * n;
	        if (original.length != totalElements) {
	            return new int[0][0];
	        }

	        int[][] result = new int[m][n];
	        for (int i = 0; i < totalElements; i++) {
	            int row = i / n;
	            int col = i % n;
	            result[row][col] = original[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Question1 converter = new Question1();
	        int[] original = {1, 2, 3, 4, 5, 6};
	        int m = 2;
	        int n = 3;
	        int[][] result = converter.convertTo2DArray(original, m, n);

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
