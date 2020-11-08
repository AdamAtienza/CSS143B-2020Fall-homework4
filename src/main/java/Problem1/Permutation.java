package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        List<List<Integer>> bigList = new ArrayList<List<Integer>>();
        permute2(nums, 0, bigList);
        return bigList;
    }

    public static void permute2(int[] nums, int index, List<List<Integer>> bigList) {
        if (index == nums.length) {
            List l = new ArrayList(nums.length);
            for (int num : nums)
                l.add(num);
            bigList.add(l);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            permute2(nums, index + 1, bigList);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
