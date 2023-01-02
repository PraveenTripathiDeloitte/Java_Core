package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Practice7 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(11);
        arrayDeque.add(12);
        List<PairNew> list = new ArrayList<>();

        list.add(new PairNew(1, 2));
        list.add(new PairNew(3, 4));
        list.add(new PairNew(5, 6));
        List<PairNew> tmp = new ArrayList<>();
        list.forEach(item -> {
            if (item.x < 10) {
                if (!arrayDeque.isEmpty())
                    item.y = arrayDeque.removeFirst();
                else
                    tmp.add(item);

            }
        });

        for (PairNew pairNew : tmp) {
            if (list.contains(pairNew))
                list.remove(pairNew);
        }

        for (PairNew pairNew : list) {
            System.out.println(pairNew.x + "->" + pairNew.y);
        }
        String tmp11 = "123,234,345";
        String tmp12 = "321,432,543";
        List<String> tmp111 = new ArrayList<>();
        String temp1 = String.join(",", tmp11.split(","));
        tmp111.add(temp1);
        String temp2 = String.join(",", tmp12.split(","));
        tmp111.add(temp2);
        System.out.println(tmp111);
    }

}

class PairNew {
    int x;
    int y;

    public PairNew(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
