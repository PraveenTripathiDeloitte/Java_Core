package practice;

import java.util.ArrayList;

public class Collection {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(2);
        names.ensureCapacity(2);

        names.add("Harry");
        names.add("Ron");
        names.add("Hermione");

        System.out.println(names);
    }
}
