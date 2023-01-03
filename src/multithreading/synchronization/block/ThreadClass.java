package multithreading.synchronization.block;

public class ThreadClass extends Thread {

    DisplayMessage displayMessage;
    String name;

    public ThreadClass(DisplayMessage displayMessage, String name) {
        this.displayMessage = displayMessage;
        this.name = name;
    }

    @Override
    public void run() {
        displayMessage.sayHello(name);
    }
}
