package multithreading;

import java.util.Scanner;

public class CalculateTime extends Thread {
    static int num;
    static int sum = 0;

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= CalculateTime.num; i++) {
            CalculateTime.sum += i;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        System.out.println("Sum of n numbers");
        System.out.println("Enter the value of n");
        Scanner scanner = new Scanner(System.in);
        CalculateTime.num = scanner.nextInt();

        CalculateTime calculateTime = new CalculateTime();
        calculateTime.start();

        calculateTime.join();

        System.out.println("The sum of first " + CalculateTime.num + " numbers is " + CalculateTime.sum);
        long end = System.currentTimeMillis();
        System.out.println("Total time taken to execute the thread is: " + (end - start) / 1000 + " seconds.");

    }
}
