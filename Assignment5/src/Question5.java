import java.util.Arrays;

public class Question5 {

	public int findDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;
        
        for (int num1 : arr1) {
            boolean found = false;
            
            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                distance++;
            }
        }
        
        return distance;
    }
    
    public static void main(String[] args) {
        Question5 distanceValue = new Question5();
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        int distance = distanceValue.findDistanceValue(arr1, arr2, d);
        System.out.println("Distance value: " + distance);
    }
}
