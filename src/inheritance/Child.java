package inheritance;

public class Child extends Parent{
    void f2(){
        System.out.println("Inside child class");
    }

    @Override
    void f1(){
        System.out.println("Inside child f1");
    }
}
