package practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion1 {

    private void recursionForward(int[] arr, int i) {
        if (i == -1)
            return;
        recursionForward(arr, i - 1);
        System.out.print(arr[i] + "--");
    }

    private List<Integer> recursionForwardStore(int[] arr, int i, List<Integer> ans) {
        if (i == 0) {
            ans.add(arr[i]);
            return ans;
        }
        recursionForwardStore(arr, i - 1, ans);
        ans.add(arr[i]);
        return ans;
    }

    private void recursionBackward(int[] arr, int i) {
        if (i == -1)
            return;
        System.out.print(arr[i] + "--");
        recursionBackward(arr, i - 1);
    }

    public static void main(String[] args) {
        Recursion1 recursion1 = new Recursion1();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        recursion1.recursionForward(arr, arr.length - 1);
        System.out.println();
        recursion1.recursionBackward(arr, arr.length - 1);
        System.out.println();
        System.out.println(recursion1.recursionForwardStore(arr, arr.length - 1, new ArrayList<>()));

    }
}
