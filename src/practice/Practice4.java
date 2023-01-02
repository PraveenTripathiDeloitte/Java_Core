package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Practice4 {
    public static void main(String[] args) {
        Set<Character> mp = new HashSet<>();
        System.out.println(mp.contains('e'));

        Class classes;

        classes = new Class("123", "132");
        classes.setRoomNumber("32");

        System.out.println(classes.getRoomNumber());

        HashMap<Character, Integer> mp1 = new HashMap<>();
        mp1.put('a', 2);
        mp1.put('b', 3);
        mp1.put('c', 1);

        Set<Character> keys1 = mp1.keySet();
        List<Integer> values = mp1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> values1 = Arrays.asList(1,2,3);
        System.out.println(values1.equals(values));
        System.out.println(values);

        String str = "Praveen";
    }
}
