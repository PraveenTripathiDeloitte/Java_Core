package multithreading;

public class MultiThread2 extends Thread {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("i = " + " " + i + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThread1 multiThread1 = new MultiThread1();
        multiThread1.start();

        for (int j = 1; j <= 100; j++) {
            System.out.print("j = " + " " + j + "\t");
            Thread.sleep(1000);
        }
    }
}
