package multithreading.synchronization.block;

public class SynchronizationDemo {

    /*
    Instead of making the complete method as synchronized
    we can create a synchronized block that will contain the
    piece of code that will be executed in synchronized way.

    This will improve the efficiency of code and waiting time
    will also be reduced because now other threads can access
    the methods and the code which are written before the
    synchronized block.
     */

    public static void main(String[] args) {
        DisplayMessage displayMessage = new DisplayMessage();

        ThreadClass thread1 = new ThreadClass(displayMessage, "Harry");
        ThreadClass thread2 = new ThreadClass(displayMessage, "Hermione");

        thread1.start();
        thread2.start();
    }
}
