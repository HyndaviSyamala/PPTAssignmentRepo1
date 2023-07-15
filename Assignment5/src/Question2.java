import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question2 {
	public int getCompleteRowCount(int n) {
        int rowCount = 0;
        int coinsNeeded = 1;

        while (n >= coinsNeeded) {
            n -= coinsNeeded;
            rowCount++;
            coinsNeeded++;
        }

        return rowCount;
    }

    public static void main(String[] args) {
        Question2 staircase = new Question2();
        int n = 10;
        int completeRows = staircase.getCompleteRowCount(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
