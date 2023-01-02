package practice;

import java.util.*;

public class Practice2 {

    static class Pair {
        private Integer x;
        private Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        int m = sc.nextInt();
        int n = sc.nextInt();
        String line = null;
        while (true) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            if (line.equals(""))
                break;

            System.out.println(m + n);
            System.out.println(str1 + ":" + str2);
        }
*/

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(2, 1);
        mp.put(3, 2);
        mp.put(2, 2);

        ArrayList<Integer> arr = new ArrayList<>();
        for (Object obj : mp.values()) {
            arr.add(Integer.valueOf((int) obj));
        }

        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) - 1);

        }

        Stack<int[]> stack = new Stack<>();
        stack.add(new int[]{1,2});
//        stack.push()
    }
}
