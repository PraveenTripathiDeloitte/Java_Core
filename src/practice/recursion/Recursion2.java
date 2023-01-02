package practice.recursion;

public class Recursion2 {

    private int maxArray(int[] arr, int i) {
        if (i == 0)
            return arr[i];
        return Math.max(arr[i], maxArray(arr, i - 1));
    }

    private int maxArrayNew(int[] arr, int i, int mx) {
        if (i == 0) {
            return arr[i];
        }
        mx = Math.max(arr[i], maxArrayNew(arr, i - 1, mx));
        return mx;
    }

    public static void main(String[] args) {
        Recursion2 recursion2 = new Recursion2();
        int[] arr = new int[]{11, 2, 3, 2, 5, 3, 10, 7};
        System.out.println(recursion2.maxArray(arr, arr.length - 1));
        System.out.println(recursion2.maxArrayNew(arr, arr.length - 1, Integer.MIN_VALUE));
    }
}
