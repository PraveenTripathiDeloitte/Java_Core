package multithreading;

public class SingleThread {


    private void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("i = " + " " + i + "\t");
        }
    }

    public static void main(String[] args) {

        SingleThread singleThread = new SingleThread();
        singleThread.printNumbers();
        System.out.println("\n");
        for (int j = 1; j <= 100; j++) {
            System.out.print("j = " + " " + j + "\t");
        }

    }
}
