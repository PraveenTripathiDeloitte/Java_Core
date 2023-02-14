package practice;

public class Practice9 {

    private int id;
    private String name;

    Practice9(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Practice9() {

    }

    public static void main(String[] args) {
        // once the content of string will change
        // new memory will assign to it.
        String str = "Hello";
        str = "Hello World";
//        System.out.println(str);

        Practice9 user1 = new Practice9(123, "Harry");
        Practice9 user2 = new Practice9(123, "Harry");

        System.out.println("For object of user");
        System.out.println(user1 == user2); // == uses shallow copy
        System.out.println(user1.equals(user2)); // by default equals also uses shallow copy

        // but for primitives, string and enums it is implemented to perform deep comparison
        Integer num1 = 2;
        Integer num2 = 2;
        System.out.println("For Primitives");
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));
    }
}
