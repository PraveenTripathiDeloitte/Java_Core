package multithreading;

import java.util.Scanner;

public class MultiThread3 extends Thread {

    static int num;
    static int sum = 0;

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= MultiThread3.num; i++) {
            MultiThread3.sum += i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sum of n numbers");
        System.out.println("Enter the value of n");
        Scanner scanner = new Scanner(System.in);
        MultiThread3.num = scanner.nextInt();

        MultiThread3 multiThread3 = new MultiThread3();
        multiThread3.start();

        multiThread3.join();

        System.out.println("The sum of first " + MultiThread3.num + " numbers is " + MultiThread3.sum);
    }
}
