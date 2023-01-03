package multithreading.communication;

public class MyThread extends Thread {

    int sum;

    @Override
    public void run() {
        System.out.println("Child thread is calculating the sum: ");
        synchronized (this) {
            for (int i = 0; i <= 100; i++) {
                sum += i;
            }
            this.notify();
        }
    }
}
