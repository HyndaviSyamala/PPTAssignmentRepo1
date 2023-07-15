import java.util.Arrays;

public class Question3 {
	public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Question3 squareSorter = new Question3();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] sortedSquares = squareSorter.sortedSquares(nums);
        System.out.println(Arrays.toString(sortedSquares));
    }
}