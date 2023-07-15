import java.util.ArrayList;
import java.util.List;

public class Question6 {

	 public List<Integer> findDuplicates(int[] nums) {
	        List<Integer> result = new ArrayList<>();

	        for (int num : nums) {
	            int absNum = Math.abs(num);
	            if (nums[absNum - 1] > 0) {
	                nums[absNum - 1] = -nums[absNum - 1];
	            } else {
	                result.add(absNum);
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Question6 findDuplicates = new Question6();
	        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
	        List<Integer> duplicates = findDuplicates.findDuplicates(nums);
	        System.out.println(duplicates);
	    }

}
