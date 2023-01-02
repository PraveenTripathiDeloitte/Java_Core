package practice;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Practice1 {


    public int lastOccurrence(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                low = mid + 1;
                ans = low;
            } else {
                high = mid - 1;
            }
        }
        return ans == -1 ? 0 : ans;
    }

    public static void main(String[] args) {
        HashMap<String, String> mp = new HashMap<>();
        mp.put("CHICAGO", "CC");
        String st = "CHICAGO";

        boolean flag = false;
        for (Object key : mp.keySet()) {
            if (st.equals(key.toString())) {
                flag = true;
                break;
            }
            if (st.equals(mp.get(key))) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);

        String city = "Carolina";
        var cities = new ArrayList();
        cities.add("New Jersy");
        cities.add("Carolina");
        boolean flag1 = cities.stream().anyMatch(s -> s.equals(city));

        System.out.println(flag1);


        List<String> array = new ArrayList<>();
        array.add("OHIO");
        array.add("WASHINGTON");


        String string1;
        string1 = "by:Ms. Hartz and Mr. Fraza R. Rahman, Julia D. Hartz";
        String[] freetext = string1.split(",|and|:");
        for (String x : freetext) {
            System.out.println(x);
        }
        String test = "Julia D. Hartz, Ms. Hartz and Mr. Joel";
        String[] split = test.split(",");
        for (String x : split) {
            System.out.println("sub_string" + test.substring(x.length(), x.length() + 2));
        }
        ArrayList<String> arr = new ArrayList<>();
        System.out.println(0);
        arr.add("a");
        arr.add("b");
        arr.add("a");

        HashSet<String> mp3 = new HashSet<>(arr);
        System.out.println(mp3);
        int[] arr1 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = i;
        }


        String r2 = "abc*";
        String rg = "\bSEC";
        System.out.println("Pattern:" + Pattern.compile(rg).matcher(" SEC").find());
        System.out.println(true);
        r2.replace('*', ' ');
        Stack<Character> stack1 = new Stack<>();
        stack1.push('(');
        char peek = stack1.peek();

        String regex11 = "[0-9]";
        System.out.println(Pattern.compile(regex11).pattern());

        int[][] lst = new int[4][5];
        for (int i = 0; i < 4; i++) {
            lst[i][0] = 0;
            lst[i][1] = 0;
        }
        Arrays.sort(lst, Comparator.comparingInt(a -> (a[0] - a[1])));
        for (int i = 0; i < 4; i++) {
            System.out.println((lst[i][0] + "" + lst[i][1]));
        }
        Practice1 practice1 = new Practice1();
        System.out.println(practice1.lastOccurrence(new int[]{1, 1, 1, 1, 1}));

        HashMap<Integer, Integer> mp1 = new HashMap<>();
//        Set<Integer> mp1 = new HashSet<>();
        mp1.put(0, 2);
        mp1.put(1, 1);
        mp1.put(2, 3);
        System.out.println("Value " + mp1.get(3));

//        Collections.sort(mp1,(a,b) -> a.get(1));
        final HashMap<Integer, Integer>[] ans = new HashMap[]{new HashMap<>()};
        mp1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(k -> ans[0].put(k.getKey(), k.getValue()));
        System.out.println("Sorted" + ans[0]);
        for (Map.Entry<Integer, Integer> x : mp1.entrySet()) {
            System.out.print(x.getKey() + " ");
        }
        int[] arrr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(Arrays.copyOfRange(arrr, 0, 0)));

        List<Integer> sm;
        sm = Arrays.asList(2, 3, 4);

        System.out.println(sm.stream().mapToDouble(Integer::intValue).sum());

        List<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(4);
        int res = ar.get(0) != null && ar.get(0) < 5 ? 10 : 12;
        System.out.println(res);

        String str11 = "4 marbles 13 white 22 red";
        char[] chars = str11.toCharArray();
        System.out.println(chars);
        String[] ans1 = str11.split(" ");
        List<Integer> integerList = new ArrayList<>();
        System.out.println(Arrays.toString(ans1));
        for (String x : ans1) {
            if (Character.isDigit(x.charAt(0)))
                integerList.add(Integer.parseInt(x));
        }
        List<Integer> sortedList = integerList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList.equals(integerList));

        System.out.println("Char to String: " + "P");

        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        System.out.println(rows.containsKey(1));
        rows.put(0, new HashSet<>(List.of('a')));
        System.out.println(rows);

        Set<Character> set = new HashSet<>();
        set.add('P');
        System.out.println(set);

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1, 2, 3));
        lists.add(Arrays.asList(4, 5, 6));
        lists.add(Arrays.asList(7, 8, 9, 12, 18));

        List<String> lstString = new ArrayList<>();
        lstString.add("Praveen");
        lstString.add("Naveen");

        String tmp = "Praveen";

        if (lstString.stream().anyMatch(str -> str.equals(tmp))) {
            System.out.println("Match found");
        }
    }

}
