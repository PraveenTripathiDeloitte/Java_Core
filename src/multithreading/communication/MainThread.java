package multithreading.communication;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();

        thread.start();

        synchronized (thread) {
            System.out.println("Main thread is going to wait:");
            thread.wait();
            System.out.println("Main thread notified");
            System.out.println(thread.sum);

        }
    }
}
