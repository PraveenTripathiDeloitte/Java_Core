package abstraction;

import java.util.ArrayList;

// we can't mark abstract class as final because if we will mark it as final,
// it can't be inherited
public abstract class AbstractClass1 {
    void func1() {
        System.out.println("Inside abstract class");
    }

    // we can't mark abstract method as static because
    // static method will always be accessed by the class name
    // which is not possible in case of abstract class
    abstract int func2(int num);

    abstract String func3(String[] string);

    abstract ArrayList<Integer> func4(int[] arr);

}
