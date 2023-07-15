import java.util.ArrayList;
import java.util.List;

public class Question7 {

	 public int findMin(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            if (nums[left] <= nums[right]) {
	                return nums[left];
	            }

	            int mid = left + (right - left) / 2;

	            if (nums[mid] > nums[right]) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        return nums[left];
	    }

	    public static void main(String[] args) {
	        Question7 findMinimum = new Question7();
	        int[] nums = {3, 4, 5, 1, 2};
	        int minimum = findMinimum.findMin(nums);
	        System.out.println("Minimum element: " + minimum);
	    }
}
