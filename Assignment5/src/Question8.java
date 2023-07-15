import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question8 {

	public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);
        List<Integer> result = new ArrayList<>();

        for (int num : changed) {
            if (freqMap.getOrDefault(num, 0) > 0) {
                int doubleNum = num * 2;
                if (freqMap.getOrDefault(doubleNum, 0) > 0) {
                    result.add(num);
                    freqMap.put(num, freqMap.get(num) - 1);
                    freqMap.put(doubleNum, freqMap.get(doubleNum) - 1);
                } else {
                    return new int[0];
                }
            }
        }

        int[] original = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            original[i] = result.get(i);
        }

        return original;
    }

    public static void main(String[] args) {
        Question8 reconstruct = new Question8();
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = reconstruct.findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }
}








