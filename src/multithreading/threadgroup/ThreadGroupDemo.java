package multithreading.threadgroup;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getParent());

        ThreadGroup threadGroup1 = new ThreadGroup("Parent");
        ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1, "Child");

        System.out.println(threadGroup2.getName());
        System.out.println(threadGroup2.getParent().getName());
        System.out.println(threadGroup1.getName());
    }
}
