package practice.recursion;

import java.util.*;

public class Recursion3 {

    private static final HashSet<List<Integer>> ans = new HashSet<>();

    private void subsequenceHelper(int[] nums, int start, int end, List<Integer> subs) {

        if (subs.size() > 1) {
            ans.add(new ArrayList<>(subs));
        }

        for (int i = start; i < end; i++) {
            if (subs.isEmpty() || nums[i] >= subs.get(subs.size() - 1)) {
                subs.add(nums[i]);
                subsequenceHelper(nums, i + 1, end, subs);
                subs.remove(subs.size() - 1);
            }

        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 6, 7, 7};
        List<Integer> item = Collections.singletonList(1);
        Recursion3 recursion3 = new Recursion3();
        List<Integer> subs = new ArrayList<>();
        recursion3.subsequenceHelper(nums, 0, nums.length, subs);
        System.out.println(Recursion3.ans);
    }
}
