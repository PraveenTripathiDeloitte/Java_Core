package multithreading.synchronization;

public class SynchronizationDemo {

    /*
    If we add keyword synchronized before any method then
    that method will become synchronized method

    If multiple threads will try to access the synchronized method
    at a time then, only one can access it at a time and others
    will have to wait until the current doesn't complete his task

    If any thread is currently accessing the synchronized method
    then the whole object of that class goes into the lock state
    and no other thread can access it until the lock finished.

    If any synchronized is currently being accessed by any thread
    then the lock will be applied on others synchronized methods
    as well which are present in that class and none of the
    synchronized methods can be accessed until the lock finished.

    Non synchronized methods can be accessed by threads because
    lock will be applied over the synchronized methods only.
     */

    public static void main(String[] args) {
        DisplayMessage displayMessage = new DisplayMessage();

        ThreadClass thread1 = new ThreadClass(displayMessage, "Harry");
        ThreadClass thread2 = new ThreadClass(displayMessage, "Hermione");

        thread1.start();
        thread2.start();
    }
}
