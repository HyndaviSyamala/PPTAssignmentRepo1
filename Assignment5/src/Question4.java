import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question4 {
	 public List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();
	        Set<Integer> diff1 = new HashSet<>();
	        Set<Integer> diff2 = new HashSet<>();

	        for (int num : nums1) {
	            set1.add(num);
	        }

	        for (int num : nums2) {
	            set2.add(num);
	        }

	        for (int num : nums1) {
	            if (!set2.contains(num)) {
	                diff1.add(num);
	            }
	        }

	        for (int num : nums2) {
	            if (!set1.contains(num)) {
	                diff2.add(num);
	            }
	        }

	        List<List<Integer>> answer = new ArrayList<>();
	        answer.add(new ArrayList<>(diff1));
	        answer.add(new ArrayList<>(diff2));
	        return answer;
	    }

	    public static void main(String[] args) {
	        Question4 distinctIntegers = new Question4();
	        int[] nums1 = {1, 2, 3};
	        int[] nums2 = {2, 4, 6};
	        List<List<Integer>> distinctLists = distinctIntegers.findDistinctIntegers(nums1, nums2);
	        System.out.println(distinctLists);
	    }
}
